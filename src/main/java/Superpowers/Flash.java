package Superpowers;

import java.util.ArrayList;

public class Flash extends Superhuman implements AttackMoves,Weapon {

    ArrayList<String> flashSuperAbilities = new ArrayList<String>();


    public Flash(){
        super("Barry Allen",
                24,
                "302-298-6521",
                "flash@flash.com",
                "Male",
                "SuperHero",
                "Metro",
                true,
                "Flash",
                null);
                flashSuperAbilities.add("Speed");
                flashSuperAbilities.add("Time Travel");
    }

    public ArrayList<String> getSuperAbility() {
        return flashSuperAbilities;
    }

    public void addSuperAbility(String superPower) {
        flashSuperAbilities.add(superPower);
    }

    public String move (){
        return "Speed Run";
    }

    public String weapon(){
        return "Thunder Run";
    }

}
