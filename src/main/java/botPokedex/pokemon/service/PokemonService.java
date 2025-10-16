package botPokedex.pokemon.service;
import botPokedex.pokemon.model.Pokemon;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.logging.Level;

public class PokemonService extends Service {

    public PokemonService() throws IOException, InterruptedException {
        super("https://raw.githubusercontent.com/Purukitto/pokemon-data.json/refs/heads/master/pokedex.json");
    }

    private final List<Pokemon> pokemons = getObjectMapper().readValue(
                    getClient().send(
                            getRequest(),
                            HttpResponse.BodyHandlers.ofString()
                    ).body(),
                getObjectMapper().getTypeFactory().constructCollectionType(
                        List.class,
                        Pokemon.class)
            );


    public Pokemon getById(int id) {
        Pokemon pokemon = null;
        for (Pokemon p : pokemons) {
            if (p.getId() == id) {
                pokemon = p;
            }
        }
        getLogger().log(Level.INFO, "Pokemon" + ((pokemon == null) ? " not" : "") + " found with id: " + id);
        return pokemon;

    }

    public Pokemon getByName(String name){
        Pokemon pokemon = null;
        for(Pokemon p : pokemons){
            if(p.getName().getEnglish().equals(name)){
                pokemon = p;
            }
        }
        return pokemon;
    }


    public List<Pokemon> getpokemons() {
        return pokemons;
    }
}
