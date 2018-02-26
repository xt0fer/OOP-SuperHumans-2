package Superpowers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PootieTang extends SuperHuman implements CatchPhrase, Attack, Gibe, FavoriteWeapon{

    ArrayList<String> pootieHeroAbilities = new ArrayList<>();

    public PootieTang() {
        super(32, "Pootie Tang", "Male", "Musician and actor", "NY, NY",
                "555-433-1223", "Pootie@crighty.pooster");
        heroName = "Pootie Tang";
        alignment= "Neutral Good";

    }
    public String attack() {
        return "(Whips out belt) \nDirty D, you a baddy daddy.\n(Whoops Dirty D's dusty behind)\nWHOOOPAA";
    }
    public String gibe() {
        return "You ain't come one, but many tine tanies!";
    }
    public String catchPhrase() {
        return "Cole me down on the panny sty.";
    }
    public String favoriteWeapon() {
        return "Daddy Tang's Belt.\n(as long as he has right on his side)\n" +
                "he can whoop anyone's behind with just this belt.";
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
