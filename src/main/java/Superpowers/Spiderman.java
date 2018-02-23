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

    public String attackmethod(){
        return "Shoots web";
    }


//    public void attackkkkk() {
//    Spiderman spiderman = new Spiderman("peter parker", 25);
//    spiderman.attackmethod();
//    }
}

