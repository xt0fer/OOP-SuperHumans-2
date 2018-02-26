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
        human.setAge(16);
        Assert.assertTrue(human.getAge() == 16);
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
        human.setPhoneNumber("1111111111");
        Assert.assertEquals(human.getPhoneNumber(), "1111111111");
    }

    @Test
    public void setEmail() {
        Human human = new Human();
        human.setEmail("techie@betterthanbatman.com");
        Assert.assertTrue(human.getEmail()== "techie@betterthanbatman.com");
        }

    @Test
    public void setOccupation() {
        Human human = new Human();
        human.setOccupation("Princess");
        Assert.assertTrue(human.getOccupation()== "Princess");
    }

    @Test
    public void setAddress() {
        Human human = new Human();
        human.setAddress("216 Rainforest Lane");
        Assert.assertTrue(human.getAddress()== "216 Rainforest Lane");
            }
}
