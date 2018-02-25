package Superpowers;

public class SuperHuman extends Human {

    String heroName;
    String superAbility;
    Boolean isGood;

    public SuperHuman() {
    }

    public SuperHuman(String name,
                      String gender,
                      String email,
                      String occupation,
                      String address,
                      String phonenumber,
                      Integer age
                      ) {
        super(name, gender, email, occupation, address, phonenumber, age);
    }

    public SuperHuman(String name, String gender, String email, String occupation, String address, String phonenumber, Integer age, String heroName, String superAbility, Boolean isGood) {
        super(name, gender, email, occupation, address, phonenumber, age );

        this.heroName = name;
        this.superAbility = "";
        this.isGood = true;
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

    public Boolean getGood() {
        return isGood;
    }

    public void setGood(Boolean good) {
        isGood = good;
    }

}


//algorithm for rotate:
// substring the String, which will split them, then rotate the back half to the front,
// and push the front half to the back.