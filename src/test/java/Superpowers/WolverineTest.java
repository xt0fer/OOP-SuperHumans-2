package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WolverineTest {


    @Test
    public void addSuperAbilityTest() {
        Wolverine wolverine = new Wolverine();
        wolverine.addSuperAbility("Strength");
        wolverine.addSuperAbility("Fast Movement");

        String expected = "[Claws, Healing, Strength, Fast Movement]";
        String actual = wolverine.getSuperAbility().toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Wolverine wolverine = new Wolverine();
        String expected = "Logan";
        String actual = wolverine.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getSuperAbilityTest() {
        Wolverine wolverine = new Wolverine();
        String expected = "[Claws, Healing]";
        String actual = wolverine.getSuperAbility().toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAttackMoveTest() {
        Wolverine wolverine = new Wolverine();
        String expected = "Slash";
        String actual = wolverine.move();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getWeaponTest() {
        Wolverine wolverine = new Wolverine();
        String expected = "Claws";
        String actual = wolverine.weapon();
        Assert.assertEquals(expected, actual);

    }
}







//    @Test
//    public void testWolverineConstructor(String name, int age, String phoneNumber, String email, String gender, String occupation,
//                                         String address, Boolean good, String heroName, ArrayList<String> superAbility){
//        // Given
//        String expectedName = "";
//        Integer expectedAge = 0;
//        String expectedEmail = "";
//        String expectedGender = "";
//        String expectedOccupation = "";
//        String expectedAddress = "";
//        Boolean expectedGood = true;
//        String expectedHeroName = "";
//        String expectedSuperAbility = "[laser, flash]";
//
//
//        // When
//        Wolverine wolverine = new Wolverine();
//
//        // Then
//        String actualName = wolverine.getName();
//        Integer actualAge = wolverine.getAge();
//        String actualEmail = wolverine.getEmail();
//        String actualGender = wolverine.getEmail();
//        String actualOccupation = wolverine.getEmail();
//        String actualAddress = wolverine.getEmail();
//        Boolean actualGood = wolverine.getGood();
//        String actualHeroName = wolverine.getHeroName();
//        String actualSuperAbility = wolverine.getSuperAbility().toString();
//
//
//
//        Assert.assertEquals(expectedName, actualName);
//        Assert.assertEquals(expectedAge, actualAge);
//        Assert.assertEquals(expectedEmail, actualEmail);
//        Assert.assertEquals(expectedGender, actualGender);
//        Assert.assertEquals(expectedOccupation, actualOccupation);
//        Assert.assertEquals(expectedAddress, actualAddress);
//        Assert.assertEquals(expectedHeroName, actualHeroName);
//        Assert.assertEquals(expectedSuperAbility, actualSuperAbility);
//
//    }
