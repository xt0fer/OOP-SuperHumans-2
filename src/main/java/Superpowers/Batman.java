package Superpowers;

public class Batman extends SuperHumans implements Weapons, HasFriends{


    public void weaponOfChoice(){
        System.out.println(this.getHeroName() + " pins a villain with his batarang");
    }
    public void hasSidekick(){
        System.out.println(this.getHeroName() + " 's sidekick is his trusted butler Alfred");
    }


}
