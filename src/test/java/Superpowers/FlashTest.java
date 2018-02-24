package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlashTest {

    @Test
    public void testSetSpeed()
    {
        //Given
        Flash flash = new Flash();
        Integer expected = 8000;

        //When
        flash.setSpeed(expected);

        //Then
        Integer actual = flash.getSpeed();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMovesTest()
    {
        //Given
        Flash flash = new Flash();
        Integer expected = flash.getSpeed() +1000;

        //When
        flash.moves();

        //Then
        Integer actual = flash.getSpeed();
        Assert.assertEquals(expected,actual);

    }
}