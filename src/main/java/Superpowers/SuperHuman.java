package Superpowers;
//                  Hero Alignments
// Lawful Good      Neutral Good        Chaotic Good
// Lawful Neutral   True(Neutral)       Chaotic Neutral
// Lawful Evil      Neutral Evil        Chaotic Evil

import java.util.ArrayList;

public class SuperHuman extends Human{
    private String Alignment;
    private  String heroName;
    private ArrayList<String> superAbility = new ArrayList<>();

    public SuperHuman() {

    }

    public SuperHuman(Integer age, String name, String gender, String occupation,
                 String address, String phoneNumber, String email) {
        super(age, name, phoneNumber, email, address, occupation, gender);
    }



    public SuperHuman(String Alignment, String heroName, String superAbility) {

        this.Alignment = Alignment;
        this.heroName = heroName;
    }

    public Object[] getSuperAbility() {
        return superAbility.toArray();
    }

    public void addSuperAbility(String superPower) {
        superAbility.add(superPower);
    }


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getAlignment() {
        return Alignment;
    }

    public void setAlignment(String alignment) {
        Alignment = alignment;
    }
}
