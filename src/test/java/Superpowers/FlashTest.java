package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlashTest {


    @Test
    public void addSuperAbilityTest() {
        Flash flash = new Flash();
        flash.addSuperAbility("Strength");
        flash.addSuperAbility("Fast Movement");
        String expected = "[Speed, Time Travel, Strength, Fast Movement]";
        String actual = flash.getSuperAbility().toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Flash flash = new Flash();
        String expected = "Barry Allen";
        String actual = flash.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSuperAbilityTest() {
        Flash flash = new Flash();
        String expected = "[Speed, Time Travel]";
        String actual = flash.getSuperAbility().toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAttackMoveTest() {
        Flash flash = new Flash();
        String expected = "Speed Run";
        String actual = flash.move();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWeaponTest() {
        Flash flash = new Flash();
        String expected = "Thunder Run";
        String actual = flash.weapon();
        Assert.assertEquals(expected, actual);
    }

}