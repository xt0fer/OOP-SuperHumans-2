package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuperHumanTest {

    @Test
    public void testSuperHumanAge()
    {
        Integer expected = 35;
        SuperHuman superHuman = new SuperHuman("Clark Kent", expected, "News Writer", "CLarkKent@gmail.com", "123 Main Street");
        Integer actual = superHuman.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSuperHumanOccupation()
    {
        String expected = "News Writer";
        SuperHuman superHuman = new SuperHuman("Clark Kent", 35, expected, "ClarkKent@gmail.com", "123 Main Street", true, "Superman", "Bulletproof");
        String actual = superHuman.getOccupation();
        Assert.assertEquals(expected,actual);
    }


//    @Test
//    public void testFlashSpeed1()
//    {
//        //Given
//        Flash flash = new Flash();
//        Integer expected  = 41;
//        flash.setSpeed(expected);
//
//        //When
//        Integer actual = flash.getSpeed();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testSetIsGood1() {
        SuperHuman superHuman = new SuperHuman();
        superHuman.setIsGood(false);
        Assert.assertFalse(superHuman.getIsGood());

    }

    @Test
    public void testSetIsGood2() {
        SuperHuman superHuman = new SuperHuman();
        superHuman.setIsGood(true);
        Assert.assertTrue(superHuman.getIsGood());

    }


    @Test
    public void testSetHeroName()
   {

       /*Leon advised solution for this test*/

        //Given
        SuperHuman superHuman = new SuperHuman();
        String expected = "Clark Kent";

        //When
        superHuman.setHeroName(expected);

        //Then
        String actual = superHuman.getHeroName();
        Assert.assertEquals(expected, actual);

    }



    @Test
    public void testSetSuperPower1() {
        //Given
        SuperHuman superHuman = new SuperHuman();
        String expected = "Bulletproof";

        //When
        superHuman.setSuperPower(expected);

        //Then
        String actual = superHuman.getSuperPower();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetSuperPower2()
    {
        //Given
        SuperHuman superHuman = new SuperHuman();
        String expected = "Flies";

        //When
        superHuman.setSuperPower(expected);

        //Then
        String actual = superHuman.getSuperPower();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetOccupation()
    {
        //Given
        SuperHuman superHuman = new SuperHuman();
        String expected = "News Writer";

        //When
        superHuman.setOccupation(expected);

        //Then
        String actual = superHuman.getOccupation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSuperHumanToString1()
    {
        SuperHuman superHuman = new SuperHuman("Clark Kent", 35, "News Writer", "ClarkKent@gmail.com",
                "123 Kent Street", true, "Superman","Bulletproof and Flies");
        String expected = "Name: Clark Kent\nAge: 35\nOccupation: News Writer\nEmail: ClarkKent@gmail.com\nAddress: 123 Kent Street\nGood or Evil: true\nHero Name: Superman\nSuperpower(s): Bulletproof and Flies\n";
        String actual = superHuman.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSuperHumanToString2()
    {
        SuperHuman superHuman = new SuperHuman("Barry Allen", 45, "Scientist", "FlashDaddy@gmail.com",
                "456 Flash Drive", true, "Flash", "Moves at lightning speed");
        String expected = "Name: Barry Allen\nAge: 45\nOccupation: Scientist\nEmail: FlashDaddy@gmail.com\nAddress: 456 Flash Drive\nGood or Evil: true\nHero Name: Flash\nSuperpower(s): Moves at lightning speed\n";
        String actual = superHuman.toString();
        Assert.assertEquals(expected, actual);
    }



}