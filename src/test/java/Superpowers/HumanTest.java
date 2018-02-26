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
    public void setFullNameTest() {
        //Given:
            // a human
            // a fullName NOT "ITS NAME" its just "A NAME"
        Human testHuman = new Human();
        String expected = "Francis";

        //When: somebody sets the fullName
        testHuman.setFullName(expected);
        String actual = testHuman.getFullName();

        //Here's what we expected: the fullName
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
        //Given
            //a human
            // an email address

        Human testHuman = new Human();
        String expected = "you@email.com";

        //When
            //a user or the dev sets the number

        testHuman.setEmail(expected);
        String actual = testHuman.getEmail();

        //Then
            //We expect to see the email:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOccupationTest() {
        //Given
            //a human
            // an occupation
        Human testHuman = new Human();
        String expected = "superstar";

        //When
            //a user or dev sets the occupation
        testHuman.setOccupation(expected);
        String actual = testHuman.getOccupation();

        //Then
            //we expect to see the occupation

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAddressTest() {
        //Given
            // a human
            // an address
        Human testHuman = new Human();
        String expected = "123 street";


        //When
            //a user or dev sets the address
        testHuman.setAddress(expected);
        String actual = testHuman.getAddress();

        //Then
            //we expect to see the address
        Assert.assertEquals(expected,actual);
    }
}
