package botPokedex.pokemon.model;
import java.util.List;
import java.util.Map;

public class Type extends Translatable{

    private List<String> effective;
    private List<String> ineffective;
    private List<String> no_effect;

    private final Map<String, String> emojis = Map.ofEntries(
            Map.entry("Normal", ":bear:"),
            Map.entry("Fire", ":fire:"),
            Map.entry("Water", ":droplet:"),
            Map.entry("Grass", ":seedling:"),
            Map.entry("Electric", ":zap:"),
            Map.entry("Ice", ":snowflake:"),
            Map.entry("Fighting", ":boxing_glove:"),
            Map.entry("Flying", ":dove:"),
            Map.entry("Poison", ":skull_crossbones:"),
            Map.entry("Ground", ":brown_circle:"),
            Map.entry("Rock", ":mountain:"),
            Map.entry("Bug", ":beetle:"),
            Map.entry("Ghost", ":ghost:"),
            Map.entry("Steel", ":gear:"),
            Map.entry("Psychic", ":crystal_ball:"),
            Map.entry("Dragon", ":dragon:"),
            Map.entry("Dark", ":crescent_moon:"),
            Map.entry("Fairy", ":sparkles:")
    );

    public Type() {}

    public List<String> getEffective() {
        return effective;
    }

    public void setEffective(List<String> effective) {
        this.effective = effective;
    }

    public List<String> getIneffective() {
        return ineffective;
    }

    public void setIneffective(List<String> ineffective) {
        this.ineffective = ineffective;
    }

    public List<String> getNo_effect() {
        return no_effect;
    }

    public void setNo_effect(List<String> no_effect) {
        this.no_effect = no_effect;
    }

    public String getEmojiByType(String type) {
        return this.emojis.get(type);
    }

    @Override
    public String toString() {
        return "Type{" +
                "effective=" + effective +
                ", ineffective=" + ineffective +
                ", no_effect=" + no_effect +
                '}';
    }
}
