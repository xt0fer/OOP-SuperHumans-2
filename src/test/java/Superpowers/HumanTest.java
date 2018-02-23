package Superpowers;


import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void getName() {
        // Given
        String expected = "John Smith";

        // When
        Human testperson = new Human(expected);
        testperson.setName(expected);
        // Then
        String actual = testperson.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        // Given
        Human testperson = new Human();
        String expected = "John Smith";

        // When
        testperson.setName(expected);
        String actual = testperson.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGender() {
        // Given
        String expected = "Male";

        // When
        Human testperson = new Human(expected);
        testperson.setGender(expected);
        // Then
        String actual = testperson.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGender() {
        // Given
        Human testperson = new Human();
        String expected = "male";

        // When
        testperson.setGender(expected);
        String actual = testperson.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOccupation() {
        // Given
        String expected = "Generic Employee";

        // When
        Human testperson = new Human(expected);
        testperson.setOccupation(expected);
        // Then
        String actual = testperson.getOccupation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOccupation() {
        // Given
        Human testperson = new Human();
        String expected = "Generic Employee";

        // When
        testperson.setOccupation(expected);
        String actual = testperson.getOccupation();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAddress() {
        // Given
        String expected = "1234 Main Street";

        // When
        Human testperson = new Human(expected);
        testperson.setAddress(expected);
        // Then
        String actual = testperson.getAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAddress() {
        // Given
        Human testperson = new Human();
        String expected = "1234 Main Street";

        // When
        testperson.setAddress(expected);
        String actual = testperson.getAddress();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        // Given
        int expected = 35;

        // When
        Human testperson = new Human(expected);
        testperson.setAge(expected);
        // Then
        int actual = testperson.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAge() {
        // Given
        Human testperson = new Human();
        int expected = 35;

        // When
        testperson.setAge(expected);
        int actual = testperson.getAge();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
