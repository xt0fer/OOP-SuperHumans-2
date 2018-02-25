package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class HulkTest {

    @Test
    public void testAttack() {
        TheIncredibleHulk angryHulk = new TheIncredibleHulk();
        String expected = "HULK SMASH";
        String actual = angryHulk.specialMove();
        Assert.assertEquals(expected, actual);
    }

}