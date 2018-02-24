package Superpowers;

public class SuperHuman extends Human {

    Boolean good;
    String heroName;
    String superAbility;


    public SuperHuman() {

    }

    public Boolean getGood() {
        return true;
    }

    public void setGood(Boolean bad) {
        this.good = true;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }


}
