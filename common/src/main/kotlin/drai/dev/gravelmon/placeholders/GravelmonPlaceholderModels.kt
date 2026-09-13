package drai.dev.gravelmon.placeholders

import com.cobblemon.mod.common.Cobblemon.LOGGER
import com.cobblemon.mod.common.client.render.models.blockbench.PosableModel
import com.cobblemon.mod.common.client.render.models.blockbench.TexturedModel
import com.cobblemon.mod.common.client.render.models.blockbench.pokemon.PokemonPosableModel
import com.cobblemon.mod.common.client.render.models.blockbench.pose.Bone
import com.cobblemon.mod.common.client.render.models.blockbench.repository.VaryingModelRepository
import com.cobblemon.mod.common.client.render.models.blockbench.repository.VaryingModelRepository.loadJsonPoser
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import net.minecraft.resources.ResourceLocation
import net.minecraft.server.packs.resources.Resource
import java.io.File
import java.nio.charset.StandardCharsets
import java.util.function.BiFunction
import kotlin.collections.set
import kotlin.math.max
import kotlin.math.pow

object GravelmonPlaceholderModels {

    init {
        VaryingModelRepository.registerFactory("gravelmonPlaceholder", BiFunction<ResourceLocation, Resource, Pair<ResourceLocation, Bone>?> { identifier: ResourceLocation, resource: Resource ->
            resource.open().use { stream ->
                val json = String(stream.readAllBytes(), StandardCharsets.UTF_8)
                val resolvedIdentifier = ResourceLocation.fromNamespaceAndPath(identifier.namespace, File(identifier.path).nameWithoutExtension)

                val texturedModel = TexturedModel.from(json)
                if (texturedModel == null) {
                    LOGGER.warn("Failed to load model file with identifier $identifier You can ignore this (and the above message) if this is not a cobblemon model")
                    return@BiFunction null
                }
                resolvedIdentifier to texturedModel.create().bakeRoot()
            }
        })
    }


    private const val MODEL_PREFIX = "cutout_gravelmon_"
    private val MODEL_DIMENSIONS = Regex("""cutout_gravelmon_(\d+)_by_(\d+)\.geo""")
    @JvmStatic
    fun createModel(modelLocation: ResourceLocation): Bone? {
        val match = MODEL_DIMENSIONS.matchEntire(modelLocation.path) ?: return null
        val width = match.groupValues[1].toInt()
        val height = match.groupValues[2].toInt()
        return TexturedModel.from(createModelJson(width, height).toString())?.create()?.bakeRoot()
    }

    @JvmStatic
    fun registerPoser(repository: VaryingModelRepository, modelLocation: ResourceLocation): (Bone) -> PosableModel {
        val poserLocation = ResourceLocation.fromNamespaceAndPath(
            modelLocation.namespace,
            modelLocation.path.removeSuffix(".geo")
        )

        val poserJson = createPoserJson(modelLocation)
        return loadJsonPoser(poserLocation.path, VaryingModelRepository.gson.toJson(poserJson), PokemonPosableModel::class.java)
    }

    private fun createPoserJson(modelLocation: ResourceLocation): JsonObject {
        val match = MODEL_DIMENSIONS.matchEntire(modelLocation.path)
            ?: throw IllegalArgumentException("Invalid placeholder model location: $modelLocation")
        val width = match.groupValues[1].toInt()
        val height = match.groupValues[2].toInt()
        val modelSize = max(width, height).toDouble()

        val poserJson = JsonObject()
        poserJson.addProperty("portraitScale", 18.3558 * modelSize.pow(-0.9805))
        poserJson.add("portraitTranslation", vector(0.09, 0.3582 * modelSize.pow(0.2354), 0.0))
        poserJson.addProperty("profileScale", 19.5349 * modelSize.pow(-0.9442))
        poserJson.add("profileTranslation", vector(0.0, 0.2881 * modelSize.pow(0.2838), 0.0))
        poserJson.add("poses", JsonObject().also {
            it.add("profile", createPose("profile", listOf("PROFILE"), "pc_fix"))
            it.add("portrait", createPose("portrait", listOf("NONE", "PORTRAIT"), "summary_fix"))
        })
        return poserJson
    }

    private fun createPose(name: String, poseTypes: List<String>, animation: String): JsonObject {
        return JsonObject().also {
            it.addProperty("poseName", name)
            it.add("poseTypes", JsonArray().also { types -> poseTypes.forEach(types::add) })
            it.add("animations", JsonArray().also { animations ->
                animations.add("q.bedrock('cutout', '$animation')")
            })
            it.add("quirks", JsonArray())
            it.add("namedAnimations", JsonObject())
            it.add("transformedParts", JsonArray())
        }
    }

    private fun vector(x: Double, y: Double, z: Double): JsonArray {
        return JsonArray().also {
            it.add(x)
            it.add(y)
            it.add(z)
        }
    }

    private fun createModelJson(width: Int, height: Int): JsonObject {
        val widthFactor = width / 128f
        val heightFactor = height / 128f
        val modelJson = JsonObject()
        modelJson.addProperty("format_version", "1.12.0")

        val geometry = JsonObject()
        modelJson.add("minecraft:geometry", JsonArray().also { it.add(geometry) })

        val description = JsonObject()
        geometry.add("description", description)
        description.addProperty("identifier", "geometry.substitute")
        description.addProperty("texture_width", width)
        description.addProperty("texture_height", height)
        description.addProperty("visible_bounds_width", 12f * widthFactor)
        description.addProperty("visible_bounds_height", 13.75f * heightFactor)
        description.add("visible_bounds_offset", JsonArray().also {
            it.add(0)
            it.add(2.125f * heightFactor)
            it.add(0)
        })

        val pivot = JsonArray().also {
            it.add(0)
            it.add(0)
            it.add(0)
        }
        val substituteBone = JsonObject()
        substituteBone.addProperty("name", "substitute")
        substituteBone.add("pivot", pivot)

        val bodyBone = JsonObject()
        bodyBone.addProperty("name", "body")
        bodyBone.addProperty("parent", "substitute")
        bodyBone.add("pivot", pivot)
        bodyBone.add("cubes", JsonArray().also {
            val cube = createCube(width, height)
            it.add(cube)
            it.add(cube.deepCopy())
        })

        geometry.add("bones", JsonArray().also {
            it.add(substituteBone)
            it.add(bodyBone)
        })
        return modelJson
    }

    private fun createCube(width: Int, height: Int): JsonObject {
        val cube = JsonObject()
        cube.add("origin", JsonArray().also {
            it.add(-width / 2)
            it.add(-1)
            it.add(0)
        })
        cube.add("size", JsonArray().also {
            it.add(width)
            it.add(height)
            it.add(0)
        })
        cube.add("uv", JsonArray().also {
            it.add(0)
            it.add(0)
        })
        return cube
    }
}