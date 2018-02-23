package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuperHumansTest {

    @Test
    public void getSuperPowerInfo() {
        // Given
        SuperHumans testHero = new SuperHumans();
        String expected = "Shoot fireballs";

        // When
        testHero.setSuperPowerInfo(expected);
        String actual = testHero.getSuperPowerInfo();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSuperPowerInfo() {
        // Given
        SuperHumans testperson = new SuperHumans();
        String expected = "John Smith";

        // When
        testperson.setName(expected);
        String actual = testperson.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHeroName() {
    }

    @Test
    public void setHeroName() {
    }

    @Test
    public void getGoals() {
    }

    @Test
    public void setGoals() {
    }

    @Test
    public void addSuperHeroPower() {
        
    }

    @Test
    public void getSuperHeroPower() {
    }
}