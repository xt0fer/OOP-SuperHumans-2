package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SuperhumanTest {

    @Test
    public void setHeroName() {
        Superhuman Superhuman = new Superhuman();
        Superhuman.setHeroName("Batman");
        Assert.assertTrue(Superhuman.getHeroName() == "Batman");
    }

    @Test
    public void addSuperAbility() {
        Superhuman Superhuman = new Superhuman();
        Superhuman.addSuperAbility("laser");
        Superhuman.addSuperAbility("flash");

        String expected = "[laser, flash]";
        String actual = Superhuman.getSuperAbility().toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGood() {
        Superhuman Superhuman = new Superhuman();
        Superhuman.setGood(true);
        Assert.assertTrue(Superhuman.getGood() == true);
    }
}