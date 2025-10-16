package botPokedex.pokemon.service;

import botPokedex.pokemon.model.Type;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;


public class TypeService extends Service {


    private final List<Type> types = getObjectMapper().readValue(getClient().send(getRequest(), HttpResponse.BodyHandlers.ofString()).body(), getObjectMapper().getTypeFactory().constructCollectionType(List.class, Type.class));

    public TypeService() throws IOException, InterruptedException {
        super("https://raw.githubusercontent.com/Purukitto/pokemon-data.json/refs/heads/master/types.json");
    }

    public List<Type> getAll(){
        return types;
    }

    public Type getTypeByEnglishName(String typeName) {
        Type type = null;
        for(Type t : types) {
            if(t.getEnglish().equals(typeName)) {
                type = t;
            }
        }
        return type;
    }

}
