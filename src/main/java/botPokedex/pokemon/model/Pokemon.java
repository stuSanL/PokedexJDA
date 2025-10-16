package botPokedex.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.IOException;
import java.util.List;

public class Pokemon {
    private int id;
    private Name name;
    @JsonProperty("type")
    private List<String> typeNames;
    private Base base;
    private String species;
    private String description;
    private Evolution evolution;
    private Profile profile;
    private Image image;

    public Pokemon() throws IOException, InterruptedException {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEvolution(Evolution evolution) {
        this.evolution = evolution;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Name getName() {
        return name;
    }

    public Base getBase() {
        return base;
    }

    public String getSpecies() {
        return species;
    }

    public String getDescription() {
        return description;
    }

    public Evolution getEvolution() {
        return evolution;
    }

    public Profile getProfile() {
        return profile;
    }

    public Image getImage() {
        return image;
    }

    public List<String> getTypeNames() {
        return typeNames;
    }

    public void setTypeNames(List<String> typeNames) {
        this.typeNames = typeNames;
    }
}