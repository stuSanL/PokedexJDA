package botPokedex.pokemon.model;

public class Name extends Translatable {

    private String french;

    public Name() {}

    public void setFrench(String french) {
        this.french = french;
    }

    public String getFrench() {
        return french;
    }
}
