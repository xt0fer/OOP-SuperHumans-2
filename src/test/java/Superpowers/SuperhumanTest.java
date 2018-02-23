package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperhumanTest {

    @Test
    public void setGoodTest() {
        Superhuman superhuman = new Superhuman();
        superhuman.setGood(true);
        Assert.assertTrue(superhuman.getGood() == true);
    }

    @Test
    public void setHeroNameTest() {
        Superhuman superhuman = new Superhuman();
        superhuman.setHeroName("Madam Butterfly");
        Assert.assertTrue(superhuman.getHeroName() == "Madam Butterfly");
    }

    @Test
    public void addSuperAbilityTest() {
        Superhuman superhuman = new Superhuman();
        superhuman.addSuperAbility("killer sting");
        superhuman.addSuperAbility("color blindness");

        String expected = "[killer sting, color blindness]";
        String actual = superhuman.getSuperAbility().toString();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printProfileTest() {
        Superhuman superhuman = new Superhuman();
        superhuman.name = "Bob Parr";
        superhuman.age = 40;
        superhuman.gender = "male";
        superhuman.phoneNumber = "111-111-1111";
        superhuman.email = "mr_incredible@incredibleINC.com";
        superhuman.occupation = "Insurance Claims Adjustor";
        superhuman.address = "105 Incredible Lane, New York, NY, 11115";
        superhuman.good = true;
        superhuman.heroName = "Mr. Incredible";
        superhuman.addSuperAbility("enhanced strength");
        superhuman.addSuperAbility("enhanced senses");
        superhuman.addSuperAbility("enhanced speed");

        String expected = "54654";
        String actual = superhuman.printProfile();

        Assert.assertEquals(expected, actual);
    }
}
