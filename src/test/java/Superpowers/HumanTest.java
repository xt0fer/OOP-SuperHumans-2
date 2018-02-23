package Superpowers;


import org.junit.Assert;
import org.junit.Test;

public class HumanTest {


    @Test
    public void setName() {
        Human human = new Human();
        human.setName("Bob");
        Assert.assertTrue(human.getName() == "Bob" );
    }

    @Test
    public void setAge() {
        Human human = new Human();
        human.setAge(21);
        Assert.assertTrue(human.getAge() == 21);
    }

    @Test
    public void setPhoneNumber() {
        Human human = new Human();
        human.setPhoneNumber("211-228-5454");
        Assert.assertTrue(human.getPhoneNumber() == "211-228-5454");
    }

    @Test
    public void setEmail() {
        Human human = new Human();
        human.setEmail("human@human.com");
        Assert.assertTrue(human.getEmail() == "human@human.com");
    }

    @Test
    public void setGender() {
        Human human = new Human();
        human.setGender("Male");
        Assert.assertTrue(human.getGender() == "Male");
    }

    @Test
    public void setOccupation() {
        Human human = new Human();
        human.setOccupation("Job");
        Assert.assertTrue(human.getOccupation() == "Job");
    }

    @Test
    public void setAddress() {
        Human human = new Human();
        human.setAddress("2 Dr Road Town State 19711");
        Assert.assertTrue(human.getAddress() == "2 Dr Road Town State 19711");
    }
}
