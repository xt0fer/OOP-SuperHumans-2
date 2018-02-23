package Superpowers;

public class Batman extends SuperHumans {
private String comesFrom = "Gotham City";
private String girlFriend = null;
    public Batman() {
    }

    public Batman(String name, int age) {
        super(name, age);
    }

    public Batman(String superPowerInfo, String heroName, String goals) {
        super(superPowerInfo, heroName, goals);
    }
}
