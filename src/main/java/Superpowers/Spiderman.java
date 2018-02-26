package Superpowers;

public class Spiderman extends SuperHumans implements UniqueAttacks {
    private String comesFrom = "New York City";
    private String girlFriend = "Mary Jane";

    public Spiderman() {
    }

    public Spiderman(String name, int age) {
        super(name, age);
    }

    public Spiderman(String superPowerInfo, String heroName, String goals) {
        super(superPowerInfo, heroName, goals);

    }

    public Spiderman(String superPowerInfo, String heroName, String goals, String comesFrom, String girlFriend) {
        super(superPowerInfo, heroName, goals);
        this.comesFrom = comesFrom;
        this.girlFriend = girlFriend;

    }
    public String attackmethod(){
        return "Shoots web";
    }
    public String alterego(){
        return "Peter Parker";
    }
    public String transport(){
        return "Long Web Swing";
    }

}

