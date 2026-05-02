package drai.dev.data.attributes.assets;

import com.google.gson.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
import java.util.function.*;

public class VariationData {
    WorldRepresentablePokemon worldRepresentablePokemon;
    Supplier<String> model, poser;
    String textureName;
    Map<String, BasicLayerData> layers = new HashMap<>();
    List<Aspect> aspects = new ArrayList<>();

    public VariationData(WorldRepresentablePokemon worldRepresentablePokemon, Supplier<String> model, Supplier<String> poser, String textureName, List<BasicLayerData> layers) {
        this.model = model;
        this.poser = poser;
        this.textureName = textureName;
        addLayers(layers);
        this.worldRepresentablePokemon = worldRepresentablePokemon;
    }

    private VariationData addLayers(List<BasicLayerData> layers) {
        for (BasicLayerData layer : layers) {
            addLayer(layer);
        }
        return this;
    }

    public VariationData addLayer(BasicLayerData layer) {
        if (this.layers.containsKey(layer.name)) return this;
        this.layers.put(layer.name, layer);
        return this;
    }

    public static VariationData fromPokemon(WorldRepresentablePokemon worldRepresentablePokemon, List<BasicLayerData> layers) {
        Supplier<String> identifier = () -> GravelmonUtils.getCleanName(worldRepresentablePokemon.getGameName()) + "_" + worldRepresentablePokemon.getCleanName();
        Supplier<String> model = () -> worldRepresentablePokemon.isModeled() ? identifier.get() : worldRepresentablePokemon.getPlaceholderModelName(false);
        return new VariationData(worldRepresentablePokemon, model, identifier, worldRepresentablePokemon.getTextureName(), layers);
    }

    public JsonObject toJsonObject(List<String> aspects) {
        return toJsonObject(aspects, false, false);
    }

    public JsonObject toJsonObject(List<String> aspects, boolean isShiny, boolean isFemale) {
        addLayer(new BasicLayerData("glow"));
        addLayer(new BasicLayerData("emissive2"));
        addLayer(new BasicLayerData("emissive"));
        addLayer(new BasicLayerData("transparentEmissive"));
        addLayer(new BasicLayerData("transparent_emissive"));
        addLayer(new BasicLayerData("flame"));
        addLayer(new BasicLayerData("tail"));

        var jsonObject = new JsonObject();
        var aspectsArray = new JsonArray();
        aspects.forEach(aspectsArray::add);
        var hasGenderDifferences = false;
        String femaleModelAffix = "";
        String femalePoserAffix = "";
        if (worldRepresentablePokemon instanceof Pokemon pokemon) {
            hasGenderDifferences = pokemon.hasGenderDifferences();
            if(hasGenderDifferences) {
                var genderDifferences = pokemon.getGenderDifferences();
                if(genderDifferences.modelDifference) femaleModelAffix = "_female";
                if(genderDifferences.animationDifference) femalePoserAffix = "_female";
            }
        }
        var model = isFemale && hasGenderDifferences
                ? (!worldRepresentablePokemon.isModeled() ? worldRepresentablePokemon.getFemalePlaceholderModelName() : this.model.get())
                : this.model.get();
        jsonObject.add("aspects", aspectsArray);
        jsonObject.addProperty("model", "cobblemon:" + model.replaceAll("placeholder\\\\","") + femaleModelAffix + ".geo");
        jsonObject.addProperty("poser", ("cobblemon:" + (worldRepresentablePokemon.isModeled() ? poser.get()+femalePoserAffix :
                worldRepresentablePokemon.getPlaceholderModelName(isFemale))).replaceAll("\\\\","/"));
        jsonObject.addProperty("texture", BasicLayerData.getTextureLocation(textureName, worldRepresentablePokemon, isShiny, isFemale));
        var layerArray = new JsonArray();
        layers.forEach((key, value) -> {
            if(value instanceof AnimatedLayerData animatedLayerData) {
                layerArray.add(animatedLayerData.toJsonObject(worldRepresentablePokemon, isShiny, isFemale));
                return;
            }
            if(value instanceof SimpleTextureLayerData simpleTextureLayerData) {
                layerArray.add(simpleTextureLayerData.toJsonObject(worldRepresentablePokemon, isShiny, isFemale));
                return;
            }
             layerArray.add(value.toJsonObject());
        });
        var emptyTextureObject = new JsonObject();
        emptyTextureObject.addProperty("texture", "cobblemon:textures/empty_texture.png");
        layerArray.add(emptyTextureObject);
        jsonObject.add("layers", layerArray);
        return jsonObject;
    }
}
