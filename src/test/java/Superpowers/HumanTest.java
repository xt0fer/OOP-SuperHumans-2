package Superpowers;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class HumanTest {
    Human human;

    @Before
    public void setUp(){
        human = new Human();
    }

    @Test
    public void setNameTest(){
        String newName = "Bruce Wayne";
        human.setName(newName);
        boolean nameHasBeenSet = human.getName().contains(newName);
        assertTrue(nameHasBeenSet);
    }
    @Test
    public void setAgeTest(){
        Integer newAge = 30;
        human.setAge(newAge);
        boolean ageHasBeenSet = human.getAge().equals(newAge);
        assertTrue(ageHasBeenSet);
    }
    @Test
    public void setGenderTest(){
        String humanGender = "Male";
        human.setGender(humanGender);
        boolean genderHasBeenSet = human.getGender().contains(humanGender);
        assertTrue(genderHasBeenSet);
    }
    @Test
    public void setPhoneNumberTest(){
        String newNumber = "3245468876";
        human.setPhoneNumber(newNumber);
        boolean numberHasBeenSet = human.getPhoneNumber().contains(newNumber);
        assertTrue(numberHasBeenSet);
    }
    @Test
    public void setEmailTest(){
        String newEmail = "bruce@WayneEnterprises.com";
        human.setEmail(newEmail);
        boolean emailHasBeenSet = human.getEmail().contains(newEmail);
        assertTrue(emailHasBeenSet);
    }
    @Test
    public void setOccupationTest(){
        String newOccupation = "CEO/Philanthropist";
        human.setOccupation(newOccupation);
        boolean occupationHasBeenSet = human.getOccupation().contains(newOccupation);
        assertTrue(occupationHasBeenSet);
    }
    @Test
    public void setAddressTest(){
        String newAddress = "1007 Mountain Dr, Gotham";
        human.setAddress(newAddress);
        boolean addressHasBeenSet = human.getAddress().contains(newAddress);
        assertTrue(addressHasBeenSet);
    }

}
