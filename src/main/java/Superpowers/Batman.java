package Superpowers;

public class Batman extends SuperHumans implements Weapons, HasFriends{

    public Batman(){
        super("Bruce Wayne", 40, "Male", "34566287790", "bruce@Wayneenterprises.com", "CEO", "1007 Mountain Dr, Gotham", "Batman", "World's greatest detective", "Good");

    }

    public void weaponOfChoice(){
        System.out.println(this.getHeroName() + " pins a villain with his batarang");
    }
    public void hasSidekick(){
        System.out.println(this.getHeroName() + " 's sidekick is his trusted butler Alfred");
    }


}
