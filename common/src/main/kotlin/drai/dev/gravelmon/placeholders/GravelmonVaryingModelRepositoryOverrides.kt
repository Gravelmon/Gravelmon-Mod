package drai.dev.gravelmon.placeholders

import com.cobblemon.mod.common.Cobblemon
import com.cobblemon.mod.common.client.render.ModelAssetVariation
import com.cobblemon.mod.common.client.render.ModelVariationSet
import com.cobblemon.mod.common.client.render.VaryingRenderableResolver
import com.cobblemon.mod.common.client.render.models.blockbench.repository.VaryingModelRepository
import com.cobblemon.mod.common.util.endsWith
import com.cobblemon.mod.common.util.fromJson
import drai.dev.gravelmon.placeholders.GravelmonPlaceholderModels.createModel
import drai.dev.gravelmon.utils.getFileNameWithoutExtension
import net.minecraft.resources.ResourceLocation
import net.minecraft.server.packs.resources.ResourceManager
import java.io.File
import java.nio.charset.StandardCharsets
import kotlin.collections.set

object GravelmonVaryingModelRepositoryOverrides {

    private const val MODEL_PREFIX = "cutout_gravelmon_"
    @JvmStatic
    fun registerVariations(resourceManager: ResourceManager, self: VaryingModelRepository) {
        self.registerGravelmonVariations(resourceManager)
    }

    fun VaryingModelRepository.registerGravelmonVariations(resourceManager: ResourceManager) {
        var variationCount = 0
        val nameToModelVariationSets = mutableMapOf<ResourceLocation, MutableList<ModelVariationSet>>()
        for (directory in variationDirectories) {
            resourceManager
                .listResources(directory) { path -> path.endsWith(".json") }
                .forEach { (_, resource) ->
                    resource.open().use { stream ->
                        val json = String(stream.readAllBytes(), StandardCharsets.UTF_8)
                        val modelVariationSet = VaryingRenderableResolver.GSON.fromJson<ModelVariationSet>(json)
                        modelVariationSet.variations.stream()
                            .filter { variation: ModelAssetVariation -> variation.model != null }
                            .forEach { variation: ModelAssetVariation ->
                                val model: ResourceLocation = variation.model!!
                                if (model.path.contains(MODEL_PREFIX)) {
                                    val resolvedIdentifier = ResourceLocation.fromNamespaceAndPath(model.namespace, model.path.replace(".json",""))
                                    val bone = createModel(resolvedIdentifier)
                                    if (bone != null) {
                                        this.texturedModels[resolvedIdentifier] = bone
                                    }
                                    val poserLocation = ResourceLocation.fromNamespaceAndPath(
                                        resolvedIdentifier.namespace,
                                        resolvedIdentifier.path.removeSuffix(".geo")
                                    )
                                    val posableModel = GravelmonPlaceholderModels.registerPoser(this, resolvedIdentifier)
                                    this.posers[poserLocation] = posableModel
                                }
                            }
                        nameToModelVariationSets.getOrPut(modelVariationSet.name) { mutableListOf() }.add(modelVariationSet)
                        variationCount += modelVariationSet.variations.size
                    }
                }
        }

        for ((species, speciesVariationSets) in nameToModelVariationSets) {
            val variations = speciesVariationSets.sortedBy { it.order }.flatMap { it.variations }.toMutableList()
            this.variations[species] = VaryingRenderableResolver(species, variations)
        }

        variations.values.forEach { it.initialize(this) }

        Cobblemon.LOGGER.info("Loaded $variationCount variations.")
    }
}