package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class SuperHumanTest {

    @Test
    public void SuperHumanTest() {

        String name = "Pootie";
        String number = "615-834-5226";
        String heroName = "Pootie Tang";
        String Alignment = "Lawful Good";
        String superPower = "Belt buckle ";

    }

    @Test
    public void catchPhraseTest() {
        PootieTang pootieTang = new PootieTang();
        String expected = "Cole me down on the panny sty.";
        String actual = pootieTang.speak();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void attackTest() {
        PootieTang pootieTang = new PootieTang();
        String expected = "(Whips out belt) \nDirty D, you a baddy daddy.\n(Whoops Dirty D's behind)\nWHOOOPAA";
        String actual = pootieTang.attack();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}