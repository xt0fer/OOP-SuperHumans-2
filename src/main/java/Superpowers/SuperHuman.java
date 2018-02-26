package Superpowers;
//                  Hero Alignments
// Lawful Good      Neutral Good        Chaotic Good
// Lawful Neutral   True(Neutral)       Chaotic Neutral
// Lawful Evil      Neutral Evil        Chaotic Evil

import java.util.ArrayList;
import java.util.Formatter;

public class SuperHuman extends Human{
    public String alignment;
    public String heroName;

    public SuperHuman() {

    }

    public SuperHuman(Integer age, String name, String gender, String occupation,
                 String address, String phoneNumber, String email) {
        super(age, name, gender, occupation, address, phoneNumber,  email);
    }



    public SuperHuman(Integer age, String name, String gender, String occupation, String address, String phoneNumber,
                      String email, String alignment, String heroName) {
        super(age, name, gender, occupation, address, phoneNumber,  email);
        this.alignment = alignment;
        this.heroName = heroName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
