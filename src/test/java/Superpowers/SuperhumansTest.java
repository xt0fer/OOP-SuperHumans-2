package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SuperhumansTest {

    @Test
    public void setHeroTest() {
        Superhumans theMan = new Superhumans();
        theMan.setName("Luke");
        theMan.setHero(true);
        Assert.assertTrue(theMan.getHero() == true);

    }

    @Test
    public void setHeroNameTest() {
        Superhumans sh = new Superhumans();
        sh.setHeroName("Super Luke");
        Assert.assertTrue(sh.getHeroName() == "Super Luke");
    }

    @Test
    public void setAbilitiesTest() {
        Superhumans sh = new Superhumans();
        sh.addAbilities("X-ray vision");
        sh.addAbilities("Aqua lung");

        String expected = "[X-ray vision, Aqua lung]";
        String actual = sh.getAbilities().toString();
        Assert.assertEquals(expected,actual);
    }


}