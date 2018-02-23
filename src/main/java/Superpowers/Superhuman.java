package Superpowers;

import java.util.ArrayList;

public class Superhuman extends Human {

    public Boolean good;
    public String heroName;
    public ArrayList<String> superAbility = new ArrayList<String>();

    public Superhuman() {
        super();

    }

    public Superhuman(String name, Integer age, String gender, String phoneNumber, String email, String occupation, String address, Boolean good, String heroName, ArrayList<String> superAbility) {
        super(name, age, gender, phoneNumber, email, occupation, address);
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

    public String printProfile(){
       String profile = String.format("Top Secret Information: \n\n" +
                "     Name............. %30s \n" +
                "     Age.............. %30d \n"+
                "     Gender........... %30s \n"+
                "     Phone Number..... %30s \n"+
                "     E-mail........... %30s \n"+
                "     Occupation....... %30s \n"+
                "     Address.......... %30s \n"+
                "     Hero............. %30s \n"+
                "     Hero Name........ %30s \n"+
                "     Super Ability.... %90s \n"+
                "This information is classified and will distruct in ONE minute.", name, age, gender, phoneNumber, email, occupation, address, good, getSuperAbility().toString());


        return profile;
    }

//    interface edna {
//        boolean specialtyDesignedCostume = true;
//    }


}

