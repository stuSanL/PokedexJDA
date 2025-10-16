package botPokedex.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Base{
    @JsonProperty("HP")
    private int hp;
    @JsonProperty("Attack")
    private int attack;
    @JsonProperty("Defense")
    private int defense;
    @JsonProperty("Sp. Attack")
    private int spAttack;
    @JsonProperty("Sp. Defense")
    private int spDefese;
    @JsonProperty("Speed")
    private int speed;

    public Base() {}

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpAttack(int spAttack) {
        this.spAttack = spAttack;
    }

    public void setSpDefese(int spDefese) {
        this.spDefese = spDefese;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public int getSpDefese() {
        return spDefese;
    }

    public int getSpeed() {
        return speed;
    }
}
