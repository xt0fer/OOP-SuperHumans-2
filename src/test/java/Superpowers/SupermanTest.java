package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SupermanTest {

    @Test
    public void setFlightHeight1()
    {
        //Given
        Superman superman = new Superman();
        Integer expected = 10;

        //When
        superman.setFlightHeight(expected);

        //Then
        Integer actual = superman.getFlightHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFlightHeight2()
    {
        //Given
        Superman superman = new Superman();
        Integer expected = 11;

        //When
        superman.setFlightHeight(expected);

        //Then
        Integer actual = superman.getFlightHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flyTest()
    {
        //Given
        Superman superman = new Superman();
        Integer expected = superman.getFlightHeight() + 1;

        //When
        superman.fly();

        //Then
        Integer actual = superman.getFlightHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBulletsDeflected()
    {
        //Given
        Superman superman = new Superman();
        Integer expected = 500;

        //When
        superman.setBulletsDeflected(expected);

        //Then
        Integer actual = superman.getBulletsDeflected();
        Assert.assertEquals(expected,actual);
    }
}