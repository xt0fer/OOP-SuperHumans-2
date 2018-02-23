package Superpowers;

public class Superman extends SuperHumans {

    private String kryptonite = "Kryptonite is my weakness";
    private String comesFrom = "Krypton";
    private String girlFriend = "Lois Lane";
    public Superman() {
    }

    public Superman(String name, int age) {
        super(name, age);
    }

    public Superman(String superPowerInfo, String heroName, String goals) {
        super(superPowerInfo, heroName, goals);
    }


    public void supermanAttack(Object villain){

    }
}
