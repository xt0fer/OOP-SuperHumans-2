package Superpowers;

import java.util.ArrayList;

public class Superhuman extends Human {

    Boolean good;
    String heroName;
    ArrayList<String> superAbility = new ArrayList<String>();

    public Superhuman(){

    }

    public Superhuman(String name, int age, String phoneNumber, String email, String gender, String occupation, String address) {
        super(name, age, phoneNumber, email, gender, occupation, address);

    }

    public Superhuman(String name, int age, String phoneNumber, String email, String gender, String occupation, String address, Boolean good, String heroName, ArrayList<String> superAbility) {
        super(name, age, phoneNumber, email, gender, occupation, address);
        this.good = good;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }



    public Boolean getGood() {
        return good;
    }

    public void setGood(Boolean good) {
        this.good = good;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public ArrayList<String> getSuperAbility() {
        return superAbility;
    }

    public void addSuperAbility(String superPower) {
        superAbility.add(superPower);
    }
    
}
