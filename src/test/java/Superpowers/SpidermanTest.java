package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpidermanTest {

    @Test
    public void testgetSuperPowerInfo() {
        // Given
        Spiderman spidey = new Spiderman();
        String expected = "Spider Senses";

        // When
        spidey.setSuperPowerInfo(expected);
        String actual = spidey.getSuperPowerInfo();

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void attackmethod() {
        Spiderman spidey = new Spiderman();
        String expected = "Shoots web";
        String actual = spidey.attackmethod();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void alterego() {
        Spiderman spidey = new Spiderman();
        String expected = "Peter Parker";
        String actual = spidey.alterego();
        Assert.assertEquals(expected, actual);
    }

}