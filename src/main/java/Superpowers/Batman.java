package Superpowers;

public class Batman extends SuperHumans implements UniqueAttacks{
private String comesFrom = "Gotham City";
private String girlFriend = "Forever Alone";
    public Batman() {
    }

    public Batman(String name, int age) {
        super(name, age);
    }

    public Batman(String superPowerInfo, String heroName, String goals) {
        super(superPowerInfo, heroName, goals);
    }
    public Batman(String superPowerInfo, String heroName, String goals, String comesFrom, String girlFriend) {
        super(superPowerInfo, heroName, goals);
        this.comesFrom = comesFrom;
        this.girlFriend = girlFriend;
    }

    @Override
    public String attackmethod() {
        return "Stealth attack";
    }
    public String alterego(){
        return "Bruce Wayne";
    }

    public String transport(){
        return "Bat Mobile";
    }



}
