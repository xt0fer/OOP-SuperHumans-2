package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class SuperHeroTest {

 @Test
    public void superHeroNameTest(){
     //Given
        //a superhero
        // a fullName
     SuperHero testSuperHero = new SuperHero();
     String expected = "testName";


     //When
        //user/dev sets fullName
     testSuperHero.setSuperHeroName(expected);
     String actual = testSuperHero.getSuperHeroName();

     //Then
        //we expect to see the fullName we supplied
     Assert.assertEquals(expected,actual);
 }

 @Test
   public void isGoodTest(){
  //Given
    //a superHero
   SuperHero testSuperHero = new SuperHero();
   Boolean expected = true;

  //When
    //isGood is set to true
  testSuperHero.setIsGood(expected);
  Boolean actual = testSuperHero.isGood();

  //Then
    //we expect it to return true
  Assert.assertEquals(expected,actual);
 }

 @Test
   public void superPowerTest() {
  //Given
    //a superhero
    //a superhero's superpower
     SuperHero testSuperHero = new SuperHero();
     String expected = "thermaFrost necklace";

  //When
    //user/dev sets superpower
  testSuperHero.setSuperPower(expected);
  String actual = testSuperHero.getSuperPower();

  //Then
    //we expected to see the superhero
  Assert.assertEquals(expected,actual);
 }
}
