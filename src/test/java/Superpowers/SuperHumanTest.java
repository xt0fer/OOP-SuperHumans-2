package Superpowers;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class SuperHumanTest {

    SuperHumans superHumans;

    @Before
    public void setUp(){
        superHumans = new SuperHumans();
    }

    @Test
    public void setHeroNameTest(){
        String newName = "Batman";
        superHumans.setHeroName(newName);
        boolean nameHasBeenSet = superHumans.getHeroName().contains(newName);
        assertTrue(nameHasBeenSet);
    }
    @Test
    public void setSuperAbilityTest(){
        String newAbility = "World's greatest detective";
        superHumans.setSuperAbility(newAbility);
        boolean abilityHasBeenSet = superHumans.getSuperAbility().contains(newAbility);
        assertTrue(abilityHasBeenSet);
    }
    @Test
    public void isGoodOrBadTest(){
        String newAlignment = "Good";
        superHumans.setAlignment(newAlignment);
        boolean alignmentHasBeenSet= superHumans.getAlignment().contains(newAlignment);
        assertTrue(alignmentHasBeenSet);
    }
}
