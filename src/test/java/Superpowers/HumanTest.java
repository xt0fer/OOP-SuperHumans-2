package Superpowers;


import org.junit.Assert;
import org.junit.Test;

public class HumanTest {

    @Test
    public void setName() {
        Human human = new Human();
        human.setName("test");
        Assert.assertTrue(human.getName()== "test");
    }

    @Test
    public void setAge() {
        Human human = new Human();
        human.setAge(10);
        Assert.assertTrue(human.getAge() == 10);
    }

    @Test
    public void setGender() {
        Human human = new Human();
        human.setGender("female");
        Assert.assertTrue(human.getGender() == "female");
    }

    @Test
    public void setPhoneNumber() {
        Human human = new Human();
        human.setPhoneNumber("333-444-5555");
        Assert.assertTrue(human.getPhoneNumber() == "333-444-5555");
    }

    @Test
    public void setEmail() {
        Human human = new Human();
        human.setEmail("hero@thehero.com");
        Assert.assertTrue(human.getEmail()== "hero@thehero.com");
    }

    @Test
    public void setOccupation() {
        Human human = new Human();
        human.setOccupation("Insurance Claims Adjustor");
        Assert.assertTrue(human.getOccupation()== "Insurance Claims Adjustor");
    }

    @Test
    public void setAddress() {
        Human human = new Human();
        human.setAddress("P. Sherman 42 Wallaby Way");
        Assert.assertTrue(human.getAddress()== "P. Sherman 42 Wallaby Way");
    }
}
