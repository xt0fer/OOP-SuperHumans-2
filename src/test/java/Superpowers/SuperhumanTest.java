package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuperhumanTest {

    @Test
    public void getHeroNameTest() {
    }

    @Test
    public void setHeroNameTest() {
        Superhuman superhuman = new Superhuman();
        superhuman.setHeroName("Shuri");
        Assert.assertTrue(superhuman.getHeroName() == "Shuri");
    }


    @Test
    public void setGoodTest() {
        Superhuman superhuman = new Superhuman();
        superhuman.setGood(true);
        Assert.assertTrue(superhuman.getGood() == true);
    }

    @Test
    public void addSuperAbilityTest() {
        Superhuman superhuman = new Superhuman();
        superhuman.addSuperAbility("Animorphism");
        superhuman.addSuperAbility("speed");
        superhuman.addSuperAbility("Genius-Level Intellect");
        superhuman.addSuperAbility("Necromancy");

        String expected = "[Animorphism, speed, Genius-Level Intellect, Necromancy]";
        String actual = superhuman.getSuperAbility().toString();


        Assert.assertEquals(expected, actual);
    }
}