package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SuperHumansTest {

    @Test
    public void testgetSuperPowerInfo() {
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
        String expected = "Iron Man";

        // When
        testperson.setSuperPowerInfo(expected);
        String actual = testperson.getSuperPowerInfo();

        // Then
        Assert.assertEquals(expected, actual);
    }

}