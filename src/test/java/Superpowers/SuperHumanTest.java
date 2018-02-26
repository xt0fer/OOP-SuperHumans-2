package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class SuperHumanTest {

    @Test
    public void pootieTangTest() {

        String name = "Pootie";
        String number = "615-834-5226";
        String heroName = "Pootie Tang";
        String Alignment = "Lawful Good";
        String superPower = "Belt buckle ";

    }

    @Test
    public void pootieTangCatchPhraseTest() {
        PootieTang pootieTang = new PootieTang();
        String expected = "Cole me down on the panny sty.";
        String actual = pootieTang.catchPhrase();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pootieTangAttackTest() {
        PootieTang pootieTang = new PootieTang();
        String expected = "(Whips out belt) \nDirty D, you a baddy daddy.\n(Whoops Dirty D's dusty behind)\nWHOOOPAA";
        String actual = pootieTang.attack();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pootieTangGibeTest() {
        PootieTang pootieTang = new PootieTang();
        String expected = "You ain't come one, but many tine tanies!";
        String actual = pootieTang.gibe();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void pootieTangFavoriteWeaponTest() {
        PootieTang pootieTang = new PootieTang();
        String expected = "Daddy Tang's Belt.\n(as long as he has right on his side)" +
                "\nhe can whoop anyone's behind with just this belt.";
        String actual = pootieTang.favoriteWeapon();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bladeTest() {

    }
    @Test
    public void bladeCatchPhraseTest() {
        Blade blade = new Blade();
        String expected ="Some motherf*****s are always trying to ice-skate uphill.";
        String actual = blade.catchPhrase();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void bladeAttackTest() {
        Blade blade = new Blade();
        String expected ="So, how many times do I have to put you in the ground?";
        String actual = blade.attack();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void bladeGibeTest() {
        Blade blade = new Blade();
        String expected ="You give Frost a message from me. You tell him it's open season on all suckheads.";
        String actual = blade.gibe();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test public void bladeFavoirteWeaponTest() {
        Blade blade = new Blade();
        String expected ="Specially tempered titanium, acid etched, with a" +
                "\n soft steel core according to the Makuri Forging technique.";
        String actual = blade.favoriteWeapon();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}
