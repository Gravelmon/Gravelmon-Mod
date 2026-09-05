package drai.dev.data.pokemon;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.entity.*;
import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.jsonwriters.assets.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.Label;
import org.jetbrains.annotations.*;

import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.List;

public abstract class WorldRepresentablePokemon {
    protected Stats stats;
    protected Type primaryType;
    protected Type secondaryType;
    protected final List<Ability> abilities = new ArrayList<>();
    protected Ability hiddenAbility;
    protected String gameName;
    protected String name;
    protected File textureDirectory;
    protected Image placeholderImage;
    protected Image femalePlaceholderImage;
    private final SpeciesFileData speciesFileData;
    private final PosingFileData posingFileData;
    private final PosingFileData femalePosingFileData;
    protected int height;
    protected double baseScale;
    protected double hitboxWidth = 6;
    protected double hitboxHeight = 6;

    protected ModelMetaData modelMetaData = new ModelMetaData();
    private boolean isReady;

    public WorldRepresentablePokemon(int height) {
        this.height = height;
        this.name = getClass().getSimpleName();
        this.baseScale = Math.max((double) height / 10 / 4, 0.1);
        setModelMetadata();
        speciesFileData = new SpeciesFileData(this);
        posingFileData = new PosingFileData(this);
        femalePosingFileData = new PosingFileData(this);
    }

    protected void processPokemonAssets(String resourcesDir, boolean hasGenderDifferences){
        if(this instanceof MegaEvolution megaEvolution) megaEvolution.onProcessResources.accept(megaEvolution);
        textureDirectory = findTextureDirectory(resourcesDir);
        if(!isModeled()){
            findOrCreatePlaceholderImage(resourcesDir, hasGenderDifferences);
            double factor = 96d / getPlaceholderMaxSideSize();
            recalculateScales(factor);
//            recalculateXYZOffsets(factor);
            posingFileData.animations.add(new AnimationData("profile", List.of(PoseType.PROFILE), List.of("pc_fix"), List.of(), 10, ""));
            posingFileData.animations.add(new AnimationData("portrait", List.of(PoseType.NONE, PoseType.PORTRAIT), List.of("summary_fix"), List.of(), 10, ""));
            ModelJsonWriter.writeModel(this, getPlaceholderImageWidth(), getPlaceholderImageHeight(), resourcesDir, false);

            if(femalePlaceholderImage != null) {
//                double femaleSizeFactor = 96d / getFemalePlaceholderMaxSideSize(abstractPokemon);
//                femalePosingFileData.portraitScale *= femaleSizeFactor;
//                femalePosingFileData.profileScale *= femaleSizeFactor;
                femalePosingFileData.animations.add(new AnimationData("profile", List.of(PoseType.PROFILE), List.of("pc_fix"), List.of(), 10, ""));
                femalePosingFileData.animations.add(new AnimationData("portrait", List.of(PoseType.NONE, PoseType.PORTRAIT), List.of("summary_fix"), List.of(), 10, ""));
                ModelJsonWriter.writeModel(this, getFemalePlaceholderImageWidth(), getFemalePlaceholderImageHeight(), resourcesDir, true);
            }
        } else {
            if(this instanceof AbstractPokemon abstractPokemon) abstractPokemon.labels.remove(Label.NOT_MODELED);
            if(this instanceof Pokemon pokemon){
                pokemon.getForms().forEach(pokemonForm -> pokemonForm.getLabels().remove(Label.NOT_MODELED));
            }
        }
        generateSpeciesFileData();
        generatePosingFileData();
        if(isModeled()) validate(resourcesDir, hasGenderDifferences);
    }

    private void setModelMetadata() {
        if(this instanceof AbstractPokemon abstractPokemon){
            this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("battle_idle", k -> new AnimationMetadata());
            this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("sleep", k -> new AnimationMetadata());
            this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("faint", k -> new AnimationMetadata());
            this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("cry", k -> new AnimationMetadata());
            this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("recoil", k -> new AnimationMetadata());
            if(abstractPokemon.canFly) {
                this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("air_idle", k -> new AnimationMetadata());
                this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("air_fly", k -> new AnimationMetadata());
                this.modelMetaData.getAnimatorsPerOptionalAnimation().computeIfAbsent("ground_idle", k -> new AnimationMetadata());
                this.modelMetaData.getAnimatorsPerOptionalAnimation().computeIfAbsent("ground_walk", k -> new AnimationMetadata());
            } else if (abstractPokemon.canSwimInWater || abstractPokemon.canSwimInLava) {

                this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("water_idle", k -> new AnimationMetadata());
                this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("water_swim", k -> new AnimationMetadata());
                if(abstractPokemon.canWalkOnWater || abstractPokemon.canWalkOnLava){
                    this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("surface_idle", k -> new AnimationMetadata());
                    this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("surface_swim", k -> new AnimationMetadata());
                }
                this.modelMetaData.getAnimatorsPerOptionalAnimation().computeIfAbsent("ground_idle", k -> new AnimationMetadata());
                if(((AbstractPokemon) this).avoidsLand){
                    return;
                }
                this.modelMetaData.getAnimatorsPerOptionalAnimation().computeIfAbsent("ground_walk", k -> new AnimationMetadata());
            } else {
                this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("ground_idle", k -> new AnimationMetadata());
                this.modelMetaData.getAnimatorsPerAnimation().computeIfAbsent("ground_walk", k -> new AnimationMetadata());
                this.modelMetaData.getAnimatorsPerOptionalAnimation().computeIfAbsent("ground_run", k -> new AnimationMetadata());
            }
        }
    }

    private void recalculateScales(double factor) {
        setBaseScale(baseScale * factor);
        double newHitboxWidth = /*Math.min(*/6 / factor/*, 3)*/;
        double newHitboxHeight =  /*Math.min(*/6 / factor/*, 3)*/;
        setHitbox(newHitboxWidth, newHitboxHeight);
        var modelSize = getPlaceholderMaxSideSize();
        posingFileData.profileScale = 19.5349 * Math.pow(modelSize, -0.9442);
        posingFileData.portraitScale = 18.3558 * Math.pow(modelSize, -0.9805);
        posingFileData.profileCoords.y = 0.2881 * Math.pow(modelSize, 0.2838);
        posingFileData.portraitCoords.y = 0.3582 * Math.pow(modelSize, 0.2354);
//        posingFileData.profileCoords.multiply(profileDiff);
    }

    private void validate(String resourcesDir, boolean hasGenderDifferences) {
        //Species File validation
        var modelName = getModelName();
        var modelLocation = resourcesDir + "\\assets\\cobblemon\\bedrock\\pokemon\\models\\"+ modelName;
        if(!new File(modelLocation+ ".geo.json").exists()){
            Cobblemon.LOGGER.warn("Model {} does not exist", modelLocation + ".geo.json");
        }
        if(hasGenderDifferences) {
            if(!new File(modelLocation+ "_female.geo.json").exists()){
                Cobblemon.LOGGER.warn("Model {} does not exist", modelLocation + "_female.geo.json");
            }
        };

        //Poser File validation
        var animationFileName = posingFileData.animationFileName + ".animation.json";
        var animationLocation = resourcesDir + "\\assets\\cobblemon\\bedrock\\pokemon\\animations\\"+animationFileName;
        if(!new File(animationLocation).exists()){
            Cobblemon.LOGGER.warn("Animation {} does not exist", animationFileName);
        } else {
            try {
                JsonObject jsonAnimation = (JsonObject) JsonParser.parseReader(new FileReader(animationLocation));
                var animationMap = new HashMap<String, String>();
                jsonAnimation.getAsJsonObject("animations").keySet().forEach(key -> {
                    var splitAnimation = key.replaceAll("animation\\.", "").split("\\.");
                    if(splitAnimation.length == 2){
                        animationMap.put(splitAnimation[1], splitAnimation[0]);
                    }
                });
                posingFileData.animations.forEach(animationData -> {
                    checkAnimationsExists(animationData, animationMap, animationFileName);

                });
            } catch (FileNotFoundException e) {
                Cobblemon.LOGGER.warn("Animation {} is invalid", animationFileName);
            }
        }
    }

    protected @NotNull String getModelName() {
        return GravelmonUtils.getCleanName(getGameName()) + "_" + getCleanName();
    }

    private void checkAnimationsExists(AnimationData animationData, HashMap<String, String> animationMap, String animationFileName) {
        var animations = new ArrayList<>(animationData.animations);
        animations.forEach(animation -> {
            if(animation.contains("q.")) return;
            if(!checkAnimationExists(animationMap, animationFileName, animation)){
                animationData.animations.remove(animation);
            }
        });
        var quirks = new ArrayList<>(animationData.getQuirks());
        quirks.forEach(quirk -> {
            var quirkAnimations = new ArrayList<>(quirk.getAnimations());
            quirkAnimations.forEach(quirkAnimation -> {
                if(!checkAnimationExists(animationMap, animationFileName, quirkAnimation)){
                    quirk.getAnimations().remove(quirkAnimation);
                }
            });
            if(quirk.getAnimations().isEmpty()) animationData.getQuirks().remove(quirk);
        });
    }

    private boolean checkAnimationExists(HashMap<String, String> animationMap, String animationFileName, String animation) {
        if (animation.equalsIgnoreCase("look")){
            if (posingFileData.head == null) return false;
            return true;
        }
        var animationIsPresent = animationMap.containsKey(animation);
//                    boolean b = !animationMap.get(animation).equals(animationFileName);
        if(!animationIsPresent/* || b*/) {
            Cobblemon.LOGGER.warn("Animation {} is not present in {}", animation, animationFileName);
            return false;
        }
        return true;
    }

    private void generateSpeciesFileData() {
        if(!isModeled()){
            speciesFileData.variations.add(VariationData.fromPokemon(this, List.of()));
        }
    }

    private void generatePosingFileData() {
        if(posingFileData.animationFileName == null || posingFileData.animationFileName.isEmpty()){
            posingFileData.animationFileName = isModeled() ? getCleanName() : "cutout";
        }
    }

    int getPlaceholderImageWidth() {
        if(placeholderImage == null) {
            System.out.println("placeholderImage is null for pokemon "+getCleanName());
            return 98;
        }
        return placeholderImage.getWidth(null);
    }
    int getPlaceholderImageHeight() {
        if(placeholderImage == null) {
            System.out.println("placeholderImage is null for pokemon "+getCleanName());
            return 98;
        }
        return placeholderImage.getHeight(null);
    }
    int getPlaceholderMaxSideSize() {
        if(placeholderImage == null) {
            System.out.println("placeholderImage is null for pokemon "+this.getCleanName());
            return 98;
        }
        return Math.max(getPlaceholderImageHeight(), getPlaceholderImageWidth());
    }

    int getFemalePlaceholderImageWidth() {
        return femalePlaceholderImage.getWidth(null);
    }
    int getFemalePlaceholderImageHeight() {
        return femalePlaceholderImage.getHeight(null);
    }

    protected @NotNull File findTextureDirectory(String resourcesDir){
        var expectedDir = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + this.getGameName().toLowerCase() + "\\" + this.getCleanName();
        return new File(expectedDir);
    }

    public boolean isModeled() {
        var directoryExists = textureDirectory.exists();
        return textureDirectory != null && directoryExists && isReady;
    }

    public void findOrCreatePlaceholderImage(String resourcesDir, boolean hasGenderDifferences) {
        String pathname = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + GravelmonUtils.getCleanName(getGameName()) + "\\";
        if (hasGenderDifferences) {
            femalePlaceholderImage = createPlaceholderTextureIfNotExists(getCleanName() + "_female.png", pathname);
        }
        placeholderImage = createPlaceholderTextureIfNotExists(getTextureName() + ".png", pathname);
    }

    public static BufferedImage createPlaceholderTextureIfNotExists(String filename, String textureDir) {
        File textureLocation = new File(textureDir + filename);
        BufferedImage image = null;
        if (!textureLocation.exists()) {
            image = new BufferedImage(2, 2, 3);
            try {
                Files.createDirectories(new File(textureDir).toPath());
                ImageIO.write(image, "png", textureLocation);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                image = ImageIO.read(textureLocation);
            } catch (IOException e) {
                System.out.println(textureLocation.getAbsolutePath());
                throw new RuntimeException(e);
            }
        }
        return image;
    }

    public SpeciesFileData getSpeciesFileData() {
        return speciesFileData;
    }

    public PosingFileData getPosingFileData(boolean isFemaleModel) {
        if(isFemaleModel) return femalePosingFileData;
        return getPosingFileData();
    }

    public PosingFileData getPosingFileData() {
        return posingFileData;
    }

    public String getPlaceholderModelName(boolean isFemaleModel) {
        if(isFemaleModel) return getFemalePlaceholderModelName();
        return "cutout_gravelmon_" + getPlaceholderImageWidth() +"_by_" + getPlaceholderImageHeight();
    }

    public String getFemalePlaceholderModelName() {
        return "cutout_gravelmon_" + getFemalePlaceholderImageWidth() +"_by_" + getFemalePlaceholderImageHeight();
    }

    public double getBaseScale() {
        return baseScale;
    }

    public void setBaseScale(double scale) {
        this.baseScale = scale;
        this.setHitbox(1,1);
        if(this instanceof Pokemon pokemon) {
            pokemon.getForms().forEach(forms -> forms.setBaseScale(scale));
        }
    }

    public double getHitboxWidth() {
        return hitboxWidth;
    }

    public double getHitboxHeight() {
        return hitboxHeight;
    }

    public void setHitbox(double width, double height) {
        this.hitboxWidth = width;
        this.hitboxHeight = height;
        if(this instanceof Pokemon pokemon){
            pokemon.getForms().forEach(forms -> {
                double newFormHitboxWidth = (double) forms.getHeight() / 10;
                double newFormHitboxHeight = (double) forms.getHeight() / 10;
                forms.setHitbox(newFormHitboxWidth, newFormHitboxHeight);
            });
        }
    }

    public String getCleanName() {
        return name.toLowerCase().replace(' ','_').replaceAll("[^a-zA-Z0-9_]", "")
                .replace("'","").replace("\\.","");
    }
    
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public abstract String getGameName();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getSpreadsheetName();

    public abstract String getTextureName();

    public Stats getStats() {
        return stats;
    }

    public Type getPrimaryType() {
        return primaryType;
    }

    public Type getSecondaryType() {
        return secondaryType;
    }

    public List<Type> getTypes() {
        var types = new ArrayList<Type>();
        if(primaryType!=null) types.add(primaryType);
        if(secondaryType!=null) types.add(secondaryType);
        return types;
    }

    public ModelMetaData getModelMetaData() {
        return modelMetaData;
    }

    public void markReady(){
        isReady = true;
    }

    public String getPrintableAbilities() {
        var abilities = String.join(", ", this.abilities.stream().map(Ability::getName).toList());
        if(hiddenAbility != null && !this.abilities.contains(hiddenAbility)) {
            abilities+= ",\n" + hiddenAbility.getName()+" (Hidden)";
        }
        return abilities;
    }

    public String getTexturePath() {
        return textureDirectory.getAbsolutePath()+ ".png";
    }

    protected void setNeedsRemodel(String reason) {
        this.modelMetaData.setNeedsRemodel(reason);
    }

    public abstract String getBasePokemon();
}
