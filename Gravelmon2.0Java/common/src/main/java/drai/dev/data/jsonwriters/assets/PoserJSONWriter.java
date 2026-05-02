package drai.dev.data.jsonwriters.assets;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;

import java.io.*;
import java.nio.file.*;

import static drai.dev.gravelmon.mega.GravelmonMegas.MEGA_EVOLUTIONS;

public class PoserJSONWriter {
    public static void writeSpecies(Game game, String resourcesDir){
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        game.getNewPokemon().forEach(pokemon -> {
            try {
                Files.createDirectories(new File(getDir(resourcesDir)).toPath());
                writePokemon(pokemon, game.getName(), resourcesDir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static void writeStandardizedForms(String resourcesDir){
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        MEGA_EVOLUTIONS.values().forEach(megas -> {
            try {
            Files.createDirectories(new File(getDir(resourcesDir)).toPath());
            megas.forEach(mega -> {
                try {
                    writePokemon(mega, mega.getGameName(), resourcesDir, gson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        ArmoredForm.ARMORED_FORMS.values().forEach(armoredForm -> {
            try {
            Files.createDirectories(new File(getDir(resourcesDir)).toPath());
                    writePokemon(armoredForm, armoredForm.getGameName(), resourcesDir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writePokemon(WorldRepresentablePokemon worldRepresentablePokemon, String gameName, String resourcesDir, Gson gson) throws IOException {
        if(worldRepresentablePokemon.isModeled()) createPoserFile(worldRepresentablePokemon.getPosingFileData(),gameName.toLowerCase() + "_" + worldRepresentablePokemon.getCleanName(), resourcesDir, gson);
        if(worldRepresentablePokemon instanceof Pokemon pokemon){
            if(pokemon.hasGenderDifferences() && pokemon.getGenderDifferences().animationDifference) createPoserFile(worldRepresentablePokemon.getPosingFileData(true),gameName.toLowerCase() + "_" + worldRepresentablePokemon.getCleanName()+"_female", resourcesDir, gson);
            for(PokemonForm form: pokemon.getForms()){
                if(!form.isModeled()) continue;
                createPoserFile(form.getPosingFileData(), gameName.toLowerCase() + "_" +form.getCleanName()+"_"+worldRepresentablePokemon.getCleanName(), resourcesDir, gson);
            }
        }

    }

    public static void createPoserFile(PosingFileData posingFileData, String name, String resourcesDir, Gson gson) throws IOException {
        var poserJson = posingFileData.getPosesJson();
        String modelLocation = getDir(resourcesDir) + name + ".json";
        Files.createDirectories(new File(modelLocation).getParentFile().toPath());
        BufferedWriter writer = new BufferedWriter(new FileWriter(modelLocation));
        writer.write(gson.toJson(poserJson));
        writer.close();
    }

    public static String getDir(String resourcesDir){
        return resourcesDir+"\\assets\\cobblemon\\bedrock\\pokemon\\posers\\";
    }
}
