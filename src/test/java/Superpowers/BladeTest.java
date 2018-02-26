package Superpowers;

import org.junit.Test;
import org.junit.Assert;

public class BladeTest {

    @Test
    public void getHeroName() {
        Blade blade = new Blade();
        String expected = "Blade";
        String actual = blade.getHeroName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAddress() {
        Blade blade = new Blade();
        String expected = "New York";
        String actual = blade.getAddress();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNameTest() {
        Blade blade = new Blade();
        String expected = "Eric Brooks";
        String actual = blade.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHeroOccupation() {
        Blade blade = new Blade();
        String expected = "Vampire Hunter";
        String actual = blade.getOccupation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBladeEmail() {
        Blade blade = new Blade();
        String expected = "Teakwood.Dagger@blade.system";
        String actual = blade.getEmail();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testBladeAlignment() {
        Blade blade = new Blade();
        String expected = "True Neutral";
        String actual = blade.getHeroAlignment();
        Assert.assertEquals(expected, actual);
    }
}
