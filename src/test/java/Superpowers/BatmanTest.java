package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BatmanTest {

    @Test
    public void setSuperPowerInfo() {
        // Given
        Batman batman = new Batman();
        String expected = "Stealth";

        // When
        batman.setSuperPowerInfo(expected);
        String actual = batman.getSuperPowerInfo();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void attackmethod() {
        Batman batman = new Batman();
        String expected = "Stealth attack";
        String actual = batman.attackmethod();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void transport() {
        Batman batman = new Batman();
        String expected = "Bat Mobile";
        String actual = batman.transport();
        Assert.assertEquals(expected, actual);
    }

}