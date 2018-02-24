package Superpowers;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HumanTest {

    @Before


    @Test
    public void setName() {
        Human human = new Human();
        human.setName("Luke");
        Assert.assertTrue(human.getName() == "Luke");
    }

    @Test
    public void setAge() {
        Human human = new Human();
        human.setAge(3);
        Assert.assertTrue(human.getAge() == 3);
    }

    @Test
    public void setGender() {
        Human human = new Human();
        human.setGender("Male");
        Assert.assertTrue(human.getGender() == "Male");
    }

    @Test
    public void setPhoneNumber() {
        Human human = new Human();
        human.setPhoneNumber("2157653600");
        Assert.assertTrue(human.getPhoneNumber() == "2157653600");
    }

    @Test
    public void setEmail() {
        Human human = new Human();
        human.setEmail("luke@aol.com");
        Assert.assertTrue(human.getEmail() == "luke@aol.com");
    }

    @Test
    public void setOccupation() {
        Human human = new Human();
        human.setOccupation("Model");
        Assert.assertTrue(human.getOccupation() == "Model");
    }

    @Test
    public void setAddress() {
        Human human = new Human();
        human.setAddress("14 Jessica way");
        Assert.assertTrue(human.getAddress() == "14 Jessica way");
    }

}
