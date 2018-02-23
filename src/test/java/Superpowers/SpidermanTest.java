package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpidermanTest {

    @Test
    public void attackmethod() {
        Spiderman spidey = new Spiderman();
        String expected = "Shoots web";
        String actual = spidey.attackmethod();
        Assert.assertEquals(expected, actual);
    }
}