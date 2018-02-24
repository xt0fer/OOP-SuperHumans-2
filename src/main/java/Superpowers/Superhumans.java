package Superpowers;

import java.util.ArrayList;

public class Superhumans extends Human {

    protected Boolean hero;
    protected String heroName;
    protected ArrayList<String> abilities = new ArrayList<String>();



    public Superhumans() {

    }

    public Superhumans(Boolean hero, String heroName, ArrayList<String> abilities) {
        super();
        this.hero = hero;
        this.heroName = heroName;
        this.abilities = abilities;
    }

    public void setHero(Boolean hero) {
        this.hero = hero;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void addAbilities(String superPower) {

        this.abilities.add(superPower);
    }

    public Boolean getHero() {
        return hero;
    }

    public String getHeroName() {
        return heroName;
    }

    public ArrayList<String> getAbilities() {

        return abilities;
    }
}


