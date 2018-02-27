package Superpowers;

import org.junit.Assert;
import org.junit.Test;


public class HumanTest {

    @Test
    public void setName() {
        Human human = new Human();
        String expected = "Thor";
        human.setName(expected);
        Assert.assertTrue(human.getName()== expected);
    }

    @Test
    public void setAge() {
        Human human = new Human();
        human.setAge(1000);
        Assert.assertTrue(human.getAge() == 1000);
    }

    @Test
    public void setGender() {
        Human human = new Human();
        String expected = "Male";
        human.setGender(expected);
        Assert.assertEquals(human.getGender(), expected);
    }

    @Test
    public void setPhoneNumber() {
        Human human = new Human();
        human.setPhoneNumber("What phone???");
        Assert.assertTrue(human.getPhoneNumber() == "What phone???");
    }

    @Test
    public void setEmail() {
        Human human = new Human();
        human.setEmail("thor.shield@Marvel.gov");
        Assert.assertTrue(human.getEmail()== "thor.shield@Marvel.gov");
    }

    @Test
    public void setOccupation() {
        Human human = new Human();
        human.setOccupation("Thunder God");
        Assert.assertTrue(human.getOccupation()== "Thunder God");
    }

    @Test
    public void setAddress() {
        Human human = new Human();
        human.setAddress("Azgard");
        Assert.assertTrue(human.getAddress()== "Azgard");
    }

}
