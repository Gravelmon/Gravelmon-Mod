package drai.dev.data.pokemon;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public abstract class AbstractPokemon extends WorldRepresentablePokemon {
    protected static String pokemonThatEvolveIntoThemselves = "Encountered pokemon that evolve into Themselves:";
    public static Map<String, Pokemon> POKEMON_REGISTRY = new HashMap<>();
    public static Map<String, List<Pokemon>> ADDITIONAL_FORMS = new HashMap<>();
    public static Map<String, List<EvolutionEntry>> ADDITIONAL_EVOLUTIONS = new HashMap<>();
    public static Map<String, List<ItemDrop>> ADDITIONAL_DROPS = new HashMap<>();
    public static Map<String, String> ADDITIONAL_PRE_EVOLUTIONS = new HashMap<>();
    public static List<Pokemon> FOSSIL_POKEMON = new ArrayList<>();
    public static List<String> EVOLUTION_ITEMS = new ArrayList<>();
    public static List<Aspect> ADDITIONAL_SPECIES_ASPECTS = new ArrayList<>();

    public int evolutionStage = 1;
    public boolean skipMoves;
    protected int catchRate;
    protected double maleRatio;
    protected int baseExperienceYield;
    protected ExperienceGroup experienceGroup;
    protected int eggCycles;
    protected List<EggGroup> eggGroups = new ArrayList<>();
    protected int dropAmount;
    protected final List<ItemDrop> drops = new ArrayList<>();
    protected final int baseFriendship;
    protected final Stats evYield;
    protected String preEvolution;
    protected List<MoveLearnSetEntry> learnSet = new ArrayList<>();
    protected final List<Label> labels = new ArrayList<>();
    protected final List<Aspect> aspects = new ArrayList<>();
    protected final int weight;
    protected final List<EvolutionEntry> evolutions = new ArrayList<>();
    protected final List<String> dexEntries = new ArrayList<>();
    protected final List<PokemonSpawnData> spawnData = new ArrayList<>();
    protected boolean cannotDynamax = false;
    protected GenderDifferences genderDifferences;
    protected int lightLevelMinSleep = 0;
    protected int lightLevelMaxSleep = 6;
    protected double swimSpeed = 0.1;
    protected double wanderChance = 1;
    protected boolean canSleep = true;
    protected boolean canFly = false;
    protected boolean canSwimInWater = true;
    protected boolean canSwimInLava = false;
    protected boolean canLookAround = true;
    protected boolean willSleepOnBed = false;
    protected boolean canBreatheUnderwater = false;
    protected boolean canBreatheUnderlava = false;
    protected boolean canWalk = true;
    protected boolean canWalkOnWater = false;
    protected boolean canWalkOnLava = false;
    protected boolean avoidsLand = false;
    private String normalizedPreEvolution;
    //TMP todo
    public SpawnPool preEvolutionSpawnPool;

    public AbstractPokemon(String name, Stats stats, Type primaryType, Type secondaryType, List<Ability> abilities, Ability hiddenAbility,
                           int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup,
                           int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions,
                           List<Label> labels, int dropAmount, List<ItemDrop> drops, int baseFriendship,
                           Stats evYield, List<MoveLearnSetEntry> learnSet, List<Aspect> aspects,
                           int height, int weight, List<PokemonSpawnData> pokemonSpawnData) {
        super(height);
        this.stats = stats;
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
        this.hiddenAbility = hiddenAbility;
        this.catchRate = catchRate;
        this.maleRatio = maleRatio;
        this.baseExperienceYield = baseExperienceYield == 0 ? 60 : baseExperienceYield;
        this.experienceGroup = experienceGroup;
        this.eggCycles = eggCycles;
        this.eggGroups.addAll(eggGroups);
        if(this.eggGroups.isEmpty()) this.eggGroups = new ArrayList<>(List.of(EggGroup.FIELD));
        this.dropAmount = dropAmount;
        this.drops.addAll(drops);
        this.baseFriendship = baseFriendship;
        this.evYield = evYield;
        this.learnSet.addAll(learnSet);
        this.aspects.addAll(aspects);
        this.weight = weight;
        this.spawnData.addAll(pokemonSpawnData);

        checkCanWalkOnSurface(spawnData);

        this.dexEntries.addAll(dexEntries);
        this.dexEntries.removeIf(entry->entry.startsWith("- "));
        if(this.dexEntries.isEmpty()) this.dexEntries.add("");

        this.labels.addAll(labels);
        this.labels.add(Label.NOT_MODELED);
        this.evolutions.addAll(evolutions);
        this.abilities.addAll(abilities);
        if (this.abilities.size() > 2) {
            this.abilities.remove(2);
        }
    }

    public static boolean isAnAdditionalForm(String key) {
        var result = ADDITIONAL_SPECIES_ASPECTS.stream().anyMatch(aspect -> Arrays.stream(key.split("(?=\\p{Upper})")).anyMatch(s -> s.equalsIgnoreCase(aspect.getName())));
        return result;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Type getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(Type primaryType) {
        this.primaryType = primaryType;
    }

    public Type getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(Type secondaryType) {
        this.secondaryType = secondaryType;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Ability getHiddenAbility() {
        return hiddenAbility;
    }

    public void setHiddenAbility(Ability hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(int catchRate) {
        this.catchRate = catchRate;
    }

    public double getMaleRatio() {
        return maleRatio;
    }

    public void setMaleRatio(double maleRatio) {
        this.maleRatio = maleRatio;
    }

    public int getBaseExperienceYield() {
        return baseExperienceYield;
    }

    public ExperienceGroup getExperienceGroup() {
        return experienceGroup;
    }

    public void setExperienceGroup(ExperienceGroup experienceGroup) {
        this.experienceGroup = experienceGroup;
    }

    public int getEggCycles() {
        return eggCycles;
    }

    public void setEggCycles(int eggCycles) {
        this.eggCycles = eggCycles;
    }

    public List<EggGroup> getEggGroups() {
        return eggGroups;
    }

    public void setEggGroups(List<EggGroup> eggGroups) {
        this.eggGroups = eggGroups;
    }

    public int getDropAmount() {
        return dropAmount;
    }

    public void setDropAmount(int dropAmount) {
        this.dropAmount = dropAmount;
    }

    public List<ItemDrop> getDrops() {
        return drops;
    }

    public int getBaseFriendship() {
        return baseFriendship;
    }

    public Stats getEvYield() {
        return evYield;
    }

    public String getPreEvolution() {
        return preEvolution;
    }

    public void setPreEvolution(String cleanName) {
        if (cleanName.equalsIgnoreCase("eevee")) {
            this.labels.add(Label.EEVEELUTION);
        }
        this.labels.add(Label.FAKEMON_EVOLUTION);
        this.preEvolution = cleanName;
        if(normalizedPreEvolution==null) {
            this.normalizedPreEvolution = cleanName;
        }
    }

    public List<MoveLearnSetEntry> getLearnSet() {
        return learnSet;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public List<Aspect> getAspects() {
        return aspects;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public List<EvolutionEntry> getEvolutions() {
        return evolutions;
    }

    public Boolean getCannotDynamax() {
        return cannotDynamax;
    }

    public void setCannotDynamax(Boolean cannotDynamax) {
        this.cannotDynamax = cannotDynamax;
    }

    public List<String> getDexEntries() {
        return dexEntries;
    }

    public List<PokemonSpawnData> getSpawnData() {
        return spawnData;
    }

    public void setLearnSet(List<MoveLearnSetEntry> learnSet) {
        this.learnSet = learnSet;
    }

    public void setBaseExperienceYield(int baseExperienceYield) {
        this.baseExperienceYield = baseExperienceYield;
    }

    protected static boolean isBasedOnOriginalPokemon(Pokemon pokemon) {
        boolean isEvoOfAPreviousPokemon = false;
        for (Label label : pokemon.labels) {
            String generationLabel = "gen";
            for (int i = 1; i < 10; i++) {
                if (label.getName().equalsIgnoreCase(generationLabel + i)) {
                    isEvoOfAPreviousPokemon = true;
                    break;
                }
            }
        }
        return isEvoOfAPreviousPokemon;
    }

    public static boolean isAnAdditionalForm(Pokemon pokemon) {
        if(pokemon == null) return false;
        return pokemon.getAdditionalAspect() != null;
    }

    protected static void addItemAsDrop(PokemonForm from, String evolutionEntry, PokemonForm result) {
        if (evolutionEntry.contains("gravelmon")) {
            if (!EVOLUTION_ITEMS.contains(evolutionEntry)) {
                EVOLUTION_ITEMS.add(evolutionEntry);
            }
            result.setDropAmount(1);
            result.getDrops().add(new ItemDrop(evolutionEntry, 40, 1, 1));
            from.setDropAmount(1);
            from.getDrops().add(new ItemDrop(evolutionEntry, 10, 1, 1));
        }
    }

    protected static void addItemAsDrop(Pokemon from, String evolutionEntry, Pokemon result) {
        if (evolutionEntry.contains("gravelmon")) {
            if (!EVOLUTION_ITEMS.contains(evolutionEntry)) {
                EVOLUTION_ITEMS.add(evolutionEntry);
            }
            result.setDropAmount(1);
            result.getDrops().add(new ItemDrop(evolutionEntry, 40, 1, 1));
            from.setDropAmount(1);
            from.getDrops().add(new ItemDrop(evolutionEntry, 10, 1, 1));
        }
    }

    public void setCanSleep(Boolean canSleep) {
        this.canSleep = canSleep;
    }

    public void setCanSwim(Boolean canSwim) {
        this.canSwimInWater = canSwim;
    }

    public void setCanLookAround(Boolean canLookAround) {
        this.canLookAround = canLookAround;
    }

    public void setAvoidsLand(Boolean avoidsLand) {
        this.avoidsLand = avoidsLand;
    }

    public void setWillSleepOnBed(Boolean willSleepOnBed) {
        this.willSleepOnBed = willSleepOnBed;
    }

    public void setCanBreathUnderwater(Boolean canBreathUnderwater) {
        this.canBreatheUnderwater = canBreathUnderwater;
    }

    public void setCanWalk(Boolean canWalk) {
        this.canWalk = canWalk;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public Boolean canFly() {
        return canFly;
    }

    public Boolean canSleep() {
        return canSleep;
    }

    public Boolean willSleepOnBed() {
        return willSleepOnBed;
    }

    public int getLightLevelMinSleep() {
        return lightLevelMinSleep;
    }

    public void setLightLevelMinSleep(int lightLevelMinSleep) {
        this.lightLevelMinSleep = lightLevelMinSleep;
    }

    public int getLightLevelMaxSleep() {
        return lightLevelMaxSleep;
    }

    public void setLightLevelMaxSleep(int lightLevelMaxSleep) {
        this.lightLevelMaxSleep = lightLevelMaxSleep;
    }

    public Boolean canLookAround() {
        return canLookAround;
    }

    public Boolean canWalk() {
        return canWalk;
    }

    public Boolean avoidsLand() {
        return avoidsLand;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public Boolean canSwim() {
        return canSwimInWater;
    }

    public Boolean canBreathUnderwater() {
        return canBreatheUnderwater;
    }

    public double getWanderChance() {
        return wanderChance;
    }

    public void setWanderChance(double wanderChance) {
        this.wanderChance = wanderChance;
    }

    public Boolean getCanWalkOnWater() {
        return canWalkOnWater;
    }

    public void setCanWalkOnWater(Boolean canWalkOnWater) {
        this.canWalkOnWater = canWalkOnWater;
    }

    public boolean isCanWalkOnLava() {
        return canWalkOnLava;
    }

    public boolean isCanBreatheUnderlava() {
        return canBreatheUnderlava;
    }

    public boolean isCanSwimInLava() {
        return canSwimInLava;
    }

    public List<MoveLearnSetEntry> getLevelUpMoves(){
        return learnSet.stream().filter(moveLearnSetEntry -> GravelmonUtils.isParsableAsInt(moveLearnSetEntry.getCondition())).toList();
    }

    public List<MoveLearnSetEntry> getTutorMoves(){
        return learnSet.stream().filter(moveLearnSetEntry -> moveLearnSetEntry.getCondition().equalsIgnoreCase("tutor")).toList();
    }

    public List<MoveLearnSetEntry> getTMMoves(){
        return learnSet.stream().filter(moveLearnSetEntry -> moveLearnSetEntry.getCondition().equalsIgnoreCase("tm")).toList();
    }

    public List<MoveLearnSetEntry> getEggMoves(){
        return learnSet.stream().filter(moveLearnSetEntry -> moveLearnSetEntry.getCondition().equalsIgnoreCase("egg")).toList();
    }

    protected void checkCanWalkOnSurface(List<PokemonSpawnData> spawnData) {
        if(spawnData.stream().anyMatch(pokemonSpawnData1 -> pokemonSpawnData1.getSpawnPresets().contains(SpawnPreset.UNDERLAVA) || pokemonSpawnData1.getSpawnPresets().contains(SpawnPreset.LAVA_SURFACE))){
            canSwimInLava = true;
            canBreatheUnderlava = true;
            if(spawnData.stream().anyMatch(pokemonSpawnData1 -> pokemonSpawnData1.getSpawnPresets().contains(SpawnPreset.LAVA_SURFACE))){
                canWalkOnLava = true;
            }
        }
    }

    protected void setSkipMoves(boolean b) {
        this.skipMoves = b;
    }

    public void setNormalizedPreEvolution(String cleanName) {
        this.normalizedPreEvolution = cleanName;
    }

    public String getNormalizedPreEvolution() {
        return normalizedPreEvolution;
    }

    public void setPreEvolutionSpawnPool(SpawnPool spawnPool) {
        this.preEvolutionSpawnPool = spawnPool;
    }

    public boolean canSwimInWater() {
        return canSwimInWater;
    }

    public static class GenderDifferences {
        public final boolean textureDifference;
        public final boolean modelDifference;
        public final boolean animationDifference;

        public GenderDifferences(boolean textureDifference, boolean modelDifference, boolean animationDifference) {
            this.textureDifference = textureDifference;
            this.modelDifference = modelDifference;
            this.animationDifference = animationDifference;
        }

        public GenderDifferences(){
            this.textureDifference = true;
            this.modelDifference = false;
            this.animationDifference = false;
        }
    }
}
