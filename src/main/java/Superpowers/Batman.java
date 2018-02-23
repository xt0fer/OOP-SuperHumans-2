package Superpowers;

import java.util.ArrayList;

public class Batman extends Superhuman implements AttackMoves, Weapon{

    ArrayList<String> batmanSuperAbilities = new ArrayList<String>();


    public Batman(){
        super("Bruce Wayne",
                34,
                "302-540-2321",
                "batman@batman.com",
                "Male",
                "SuperHero",
                "Gotham",
                true,
                "Batman",
                null);
        batmanSuperAbilities.add("Intelligence");
        batmanSuperAbilities.add("Gadgets");
    }

    public ArrayList<String> getSuperAbility() {
        return batmanSuperAbilities;
    }

    public void addSuperAbility(String superPower) {
        batmanSuperAbilities.add(superPower);
    }

    public String move (){
        return "Smash";
    }

    public String weapon(){
        return "Grappling Hook";
    }
}

