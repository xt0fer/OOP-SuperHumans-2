package Superpowers;


import org.junit.Assert;
import org.junit.Test;

public class HumanTest {

    @Test
    public void setName() {
        Human human = new Human();
        String expected = "Superman";
        human.setName(expected);
        String actual = human.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGender() {
        Human human = new Human();
        String expected = "F";
        human.setGender(expected);
        String actual = human.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAge() {
        Human human = new Human();
        int expected = 33;
        human.setAge(expected);
        int actual = human.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmail() {
        Human human = new Human();
        String expected = "superman@hotmail.com";
        human.setEmail(expected);
        String actual = human.getEmail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOccupation() {
        Human human = new Human();
        String expected = "Superhero";
        human.setOccupation(expected);
        String actual = human.getOccupation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPhoneNumber() {
        Human human = new Human();
        String expected = "1234567";
        human.setPhoneNumber(expected);
        String actual = human.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAddress() {
        Human human = new Human();
        String expected = "Metropolis";
        human.setAddress(expected);
        String actual = human.getAddress();
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void listAllData() {
//        Human human = new Human();
//        human.setEmail(expected);
//        String actual = human.listAllData();
//        Assert.assertEquals(expected, actual);
//    }
}
