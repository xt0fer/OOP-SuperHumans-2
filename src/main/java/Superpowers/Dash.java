package Superpowers;

public class Dash extends Superhuman implements Attack{
    public Dash() {
        Superhuman dash = new Superhuman();
        dash.name = "Dashiell Robert Parr";
        dash.age = 10;
        dash.gender = "male";
        dash.phoneNumber = "444-444-4444";
        dash.email = "dash@incredibleINC.com";
        dash.occupation = "Student";
        dash.address = "105 Incredible Lane, New York, NY, 11115";
        dash.good = true;
        dash.heroName = "Dash";
        dash.addSuperAbility("superhuman speed");
        dash.addSuperAbility("superhumun agility");
        dash.addSuperAbility("super speeding combat ability");
        dash.printProfile();
    }

    public String costume(){
        return "super speed without fire";
    }

    public String attack(){
        return "kick";
    }

    public String enemy() {
        return "Syndrome";
    }
}
