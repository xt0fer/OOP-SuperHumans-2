package Superpowers;

import java.util.ArrayList;

public class Superhuman extends Human {
    Boolean good;
    String heroName;
    public ArrayList<String> superAbility = new ArrayList<String>();

    public Superhuman(){
        super();
    }

    //the constructor for Superhuman
    public Superhuman(String name, Integer age, String gender, String occupation, String address, String email, String phoneNumber, ArrayList<String> superAbility){
        super(name, age, gender,occupation, email, address, phoneNumber);
        this.good = good;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }


    public String getHeroName(){
        return heroName;
    }

    public void setHeroName(String heroName){
        this.heroName = heroName;
    }

    public Boolean getGood() {
        return good;
    }

    public void setGood(Boolean good) {
        this.good = good;
    }

    public ArrayList<String> getSuperAbility() {
        return superAbility;
    }

    public void addSuperAbility(String superpower) {
        superAbility.add(superpower);
    }



}
