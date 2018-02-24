package Superpowers;

public class SuperHumans extends Human {
    private String heroName;
    private String superAbility;
    private String alignment;

    public SuperHumans(){
    }

    public SuperHumans(String heroName, String superAbility, String alignment) {
        this.heroName = heroName;
        this.superAbility = superAbility;
        this.alignment = alignment;
    }

    public SuperHumans(String name, Integer age, String gender, String phoneNumber, String email, String occupation, String address, String heroName, String superAbility, String alignment) {
        super(name, age, gender, phoneNumber, email, occupation, address);
        this.heroName = heroName;
        this.superAbility = superAbility;
        this.alignment = alignment;
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

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    @Override
    public String toString() {
        return "SuperHumans{" +
                "heroName='" + heroName + '\'' +
                ", superAbility='" + superAbility + '\'' +
                ", goodOrBad=" + alignment +
                '}';
    }


    }

