package Superpowers;

public class Blade extends SuperHuman implements CatchPhrase, Attack, Gibe, FavoriteWeapon{

    public Blade() {
    }

    @Override
    public String attack() {
        return "So, how many times do I have to put you in the ground?";
    }

    @Override
    public String catchPhrase() {
        return "Some motherf*****s are always trying to ice-skate uphill.";
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
}
