package Superpowers;

import java.util.ArrayList;

public class Superhuman extends Human {

    public Boolean good;
    public String heroName;
    public ArrayList<String> superAbility = new ArrayList<String>();

    public Superhuman() {

    }

    public Superhuman(String name, Integer age, String gender, String phoneNumber, String email, String occupation, String address, Boolean good, String heroName, ArrayList<String> superAbility) {
        super(name, age, gender, phoneNumber, email, occupation, address);
        this.good = good;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public Superhuman(Boolean good, String heroName, ArrayList<String> superAbility) {
        super();
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

    public static void main(String[] args) {
        Superhuman mrIncredible = new Superhuman();
        mrIncredible.name = "Bob Parr";
        mrIncredible.age = 40;
        mrIncredible.gender = "male";
        mrIncredible.phoneNumber = "111-111-1111";
        mrIncredible.email = "mr_incredible@incredibleINC.com";
        mrIncredible.occupation = "Insurance Claims Adjustor";
        mrIncredible.address = "105 Incredible Lane, New York, NY, 11115";
        mrIncredible.good = true;
        mrIncredible.heroName = "Mr. Incredible";
        mrIncredible.addSuperAbility("enhanced strength");
        mrIncredible.addSuperAbility("enhanced senses");
        mrIncredible.addSuperAbility("enhanced speed");
        mrIncredible.printProfile();

        Superhuman elastigirl = new Superhuman();
        elastigirl.name = "Helen Parr";
        elastigirl.age = 37;
        elastigirl.gender = "female";
        elastigirl.phoneNumber = "222-222-2222";
        elastigirl.email = "elastigirl@incredibleINC.com";
        elastigirl.occupation = "Housewife";
        elastigirl.address = "105 Incredible Lane, New York, NY, 11115";
        elastigirl.good = true;
        elastigirl.heroName = "Elastigirl";
        elastigirl.addSuperAbility("elasticity");
        elastigirl.addSuperAbility("shape shifting");
        elastigirl.addSuperAbility("bullet immunity");
        elastigirl.printProfile();

        Superhuman littleMissDiappear = new Superhuman();
        littleMissDiappear.name = "Violet Parr";
        littleMissDiappear.age = 14;
        littleMissDiappear.gender = "female";
        littleMissDiappear.phoneNumber = "222-222-2222";
        littleMissDiappear.email = "violet@incredibleINC.com";
        littleMissDiappear.occupation = "Student";
        littleMissDiappear.address = "105 Incredible Lane, New York, NY, 11115";
        littleMissDiappear.good = true;
        littleMissDiappear.heroName = "Little Miss Disappear";
        littleMissDiappear.addSuperAbility("invisibility");
        littleMissDiappear.addSuperAbility("force fields");
        littleMissDiappear.addSuperAbility("levitation");
        littleMissDiappear.printProfile();

        Superhuman dash = new Superhuman();
        dash.name = "Dashiell Robert Parr";
        dash.age = 10;
        dash.gender = "male";
        dash.phoneNumber = "222-222-2222";
        dash.email = "dash@incredibleINC.com";
        dash.occupation = "Student";
        dash.address = "105 Incredible Lane, New York, NY, 11115";
        dash.good = true;
        dash.heroName = "Dash";
        dash.addSuperAbility("superhuman speed");
        dash.addSuperAbility("superhumun agility");
        dash.addSuperAbility("super speeding combat ability");
        littleMissDiappear.printProfile();
    }
}

