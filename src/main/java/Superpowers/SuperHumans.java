package Superpowers;


import java.util.ArrayList;

public class SuperHumans extends Human {
private String superPowerInfo = "";
private String heroName = "";
private String goals = "";
//private ArrayList<String> superHeroTrait = new ArrayList<String>();




    //constructors
    public SuperHumans (){}
    public SuperHumans(String name, int age) {
        super(name, age);
    }
    public SuperHumans(String superPowerInfo, String heroName, String goals){
        this.superPowerInfo = superPowerInfo;
        this.heroName = heroName;
        this.goals = goals;
    }


    //methods
    public String getSuperPowerInfo() {
        return superPowerInfo;
    }
    public void setSuperPowerInfo(String superPowerInfo) {
        this.superPowerInfo = superPowerInfo;
    }

    public String getHeroName() {
        return heroName;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getGoals() {
        return goals;
    }
    public void setGoals(String goals) {
        this.goals = goals;
    }

}
