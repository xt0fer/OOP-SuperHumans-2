package Superpowers;

public class Batman extends SuperHumans implements UniqueAttacks{
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

    @Override
    public String attackmethod() {
        return "fist fighter";
    }


   // Batman batman = new Batman("Bruce wayne", 40);
   // Batman batman2 = new Batman("very rich", "the darkknight", "save people");


}
