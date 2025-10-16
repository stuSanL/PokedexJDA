package botPokedex.pokemon.model;

import java.util.List;

public class Profile{
    private String height;
    private String weight;
    private List<String> egg;
    private List<List<String>> ability;
    private String gender;

    public Profile() {}

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setEgg(List<String> egg) {
        this.egg = egg;
    }

    public void setAbility(List<List<String>> ability) {
        this.ability = ability;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public List<String> getEgg() {
        return egg;
    }

    public List<List<String>> getAbility() {
        return ability;
    }

    public String getGender() {
        return gender;
    }
}