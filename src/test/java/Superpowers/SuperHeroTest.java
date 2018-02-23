package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class SuperHeroTest {

 @Test
    public void superHeroNameTest(){
     //Given
        //a superhero
        // a name
     SuperHero testSuperHero = new SuperHero();
     String expected = "testName";


     //When
        //user/dev sets name
     testSuperHero.setSuperHeroName(expected);
     String actual = testSuperHero.getSuperHeroName();

     //Then
        //we expect to see the name we supplied
     Assert.assertEquals(expected,actual);
 }
}
