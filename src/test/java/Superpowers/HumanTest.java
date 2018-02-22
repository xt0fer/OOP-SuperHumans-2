package Superpowers;

/**
 *
 * AMYYYYYYYYYYY hi, here's your "catch-all" "let's make your test case fail asap:
 *           Assert.assertTrue(false);
 *
 */


import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void setNameTest() {
        //Given:
            // a human
            // a name NOT "ITS NAME" its just "A NAME"
        Human testHuman = new Human();
        String expected = "Francis";

        //When: somebody sets the name
        testHuman.setName(expected);
        String actual = testHuman.getName();

        //Here's what we expected: the name
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAgeTest() {
        //Given:
            // a human
            // an age
        Human testHuman = new Human();
        int expected = 12;


        // When
            // user sets the age
        testHuman.setAge(expected);
        int actual = testHuman.getAge();

        // Then
            //We expect to see the age:
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setPhoneNumberTest() {
        //Given
            //a human
            // a phone number
        Human testHuman = new Human();
        String expected = "1234";

        //When
            //a user or the dev sets the phone number
        testHuman.setPhoneNumber(expected);
        String actual = testHuman.getPhoneNumber();

        //Then
            //We expect to see the age
        Assert.assertEquals(expected,actual);

    }

    @Test // TODO
    public void setEmailTest() {

        Assert.assertTrue(false);
    }

    @Test
    public void setOccupationTest() {
        Assert.assertTrue(false);
    }

    @Test
    public void setAddressTest() {
        Assert.assertTrue(false);
    }
}
