package Superpowers;

import java.util.ArrayList;

public class Blade extends SuperHuman implements CatchPhrase, Attack, Gibe, FavoriteWeapon {


    ArrayList<String> bladeHeroAbilities = new ArrayList<>();

    public Blade() {
        super(45, "Eric Brooks", "Male", "Vampire Hunter",
                "New York", "456-023-3456", "Teakwood.Dagger@blade.system");

        bladeHeroAbilities.add("Vampire Hybrid: Immune to vampiric weakness");
        bladeHeroAbilities.add("Versatile in martial arts, swords, and investigation.");
        alignment = "True Neutral";
        heroName = "Blade";
    }

    @Override
    public String attack() {
        return "So, how many times do I have to put you in the ground?";
    }

    @Override
    public String catchPhrase() {
        return "Some m***********s are always trying to ice-skate uphill.";
    }

    @Override
    public String favoriteWeapon() {
        return "Specially tempered titanium, acid etched, with a" +
                "\n soft steel core according to the Makuri Forging technique.";
    }

    @Override
    public String gibe() {
        return "You give Frost a message from me. You tell him it's open season on all suckheads.";
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName() {
        this.heroName = "Blade";
    }

    public String getHeroAlignment() {
        return alignment;
    }

    public void setAlignment() {
        this.alignment = "True Neutral";
    }

}
