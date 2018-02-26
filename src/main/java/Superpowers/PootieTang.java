package Superpowers;

public class PootieTang extends SuperHuman implements CatchPhrase, Attack, Gibe, FavoriteWeapon{

    public PootieTang() {
        super(32, "Pootie Tang", "Male", "Poster Child", "NY, NY", "555-433-1223", "Pootie@crighty.pooster");
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
        return "Daddy Tang's Belt.\n(as long as he has right on his side)\nhe can whoop anyone's behind with just this belt.";
    }
}
