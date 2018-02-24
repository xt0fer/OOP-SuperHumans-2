package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {


    @Test
    public void setName()
    {
        Human human = new Human();
        String expected = "Clark Kent";
        human.setName(expected);
        String actual = human.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAge()
    {
        Human human = new Human();
        human.setAge(35);
        Assert.assertTrue(human.getAge() == 35);
    }

    @Test
    public void setOccupation()
    {
        Human human = new Human();
        human.setOccupation("News Writer");
        Assert.assertTrue(human.getOccupation().equals("News Writer"));
    }

    @Test
    public void setEmail()
    {
        Human human = new Human();
        human.setEmail("ClarkKent@gmail.com");
        Assert.assertTrue(human.getEmail().equals("ClarkKent@gmail.com"));
    }

    @Test
    public void setAddress()
    {
        Human human = new Human();
        human.setAddress("123 Fourth Street");
        Assert.assertTrue(human.getAddress().equals("123 Fourth Street"));

    }

    @Test
    public void testToString()
    {
        Human human = new Human("Clark Kent", 35, "News Writer", "ClarkKent@gmail.com", "123 Kent Street" );
        String expected = "Name: Clark Kent\nAge: 35\nOccupation: News Writer\nEmail: ClarkKent@gmail.com\nAddress: 123 Kent Street\n";
        String actual = human.toString();
        Assert.assertEquals(expected,actual);
    }


}