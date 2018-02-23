package Superpowers;

import java.util.ArrayList;
import java.util.Arrays;

public class Wolverine extends Superhuman implements AttackMoves, Weapon {

    public ArrayList<String> wolverineSuperAbilities = new ArrayList<String>();


    public Wolverine(){
        super("Logan",
                35,
                "302-540-2982",
                "wolverine@wolverine.com",
                "Male",
                "X-Men",
                "2",
                true,
                "Wolverine" ,
                null);
        wolverineSuperAbilities.add("Claws");
        wolverineSuperAbilities.add("Healing");
    }


    public ArrayList<String> getSuperAbility() {
        return wolverineSuperAbilities;
    }

    public void addSuperAbility(String superPower) {
        wolverineSuperAbilities.add(superPower);
    }

    public String move (){
        return "Slash";
    }

    public String weapon(){
        return "Claws";
    }
}
