package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BatmanTest {

    @Test
    public void addSuperAbilityTest() {
        Batman batman = new Batman();
        batman.addSuperAbility("Strength");
        batman.addSuperAbility("Fast Movement");
        String expected = "[Intelligence, Gadgets, Strength, Fast Movement]";
        String actual = batman.getSuperAbility().toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Batman batman = new Batman();
        String expected = "Bruce Wayne";
        String actual = batman.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getSuperAbilityTest() {
        Batman batman = new Batman();
        String expected = "[Intelligence, Gadgets]";
        String actual = batman.getSuperAbility().toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAttackMoveTest() {
        Batman batman = new Batman();
        String expected = "Smash";
        String actual = batman.move();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getWeaponTest() {
        Batman batman = new Batman();
        String expected = "Grappling Hook";
        String actual = batman.weapon();
        Assert.assertEquals(expected, actual);

    }

}