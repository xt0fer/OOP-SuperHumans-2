package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class IronManTest {

    @Test
    public void testAttack() {
        IronMan ironTony = new IronMan();
        String expected = "JetFuel";
        String actual = ironTony.jetPack();
        Assert.assertEquals(expected, actual);
    }

}