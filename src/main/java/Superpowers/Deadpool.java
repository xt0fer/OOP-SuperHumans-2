package Superpowers;

public class Deadpool extends SuperHumans implements Weapons, AddedCommentary{


    public void weaponOfChoice() {
        System.out.println(this.getHeroName() + "chops you up with swords when he forgets his ammo at home");
    }

    public void wittyComebacks() {
        System.out.println(this.getHeroName() + "talks smack to his nemesis Francis");
    }



}
