package Superpowers;

public class SuperHero extends Human {

    String superHeroName = "";
    Boolean isGood = false;
    String superPower = "";

    public static void main(String[] args) {

    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public Boolean isGood() {
        return isGood;
    }

    public void setIsGood(Boolean good) {
        isGood = good;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }



}
