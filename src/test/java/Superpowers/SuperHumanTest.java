package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuperHumanTest {

    @Test
    public void setGood() {
        SuperHuman superHuman = new SuperHuman();
        Boolean expected = true;
        superHuman.setGood(expected);
        Boolean actual = superHuman.getGood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHeroName() {
        SuperHuman superHuman = new SuperHuman();
        String expected = "Wonder Woman";
        superHuman.setHeroName(expected);
        String actual = superHuman.getHeroName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSuperAbility() {
        SuperHuman superHuman = new SuperHuman();
        String expected = "Super Strength";
        superHuman.setSuperAbility(expected);
        String actual = superHuman.getSuperAbility();
        Assert.assertEquals(expected, actual);
    }


}