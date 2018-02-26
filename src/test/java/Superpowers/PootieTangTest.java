package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class PootieTangTest {

    @Test
    public void getHeroName() {
        PootieTang pootie = new PootieTang();
        String expected = "Pootie Tang";
        String actual = pootie.getHeroName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAddress() {
        PootieTang pootie = new PootieTang();
        String expected = "NY, NY";
        String actual = pootie.getAddress();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNameTest() {
        PootieTang pootie = new PootieTang();
        String expected = "Pootie Tang";
        String actual = pootie.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHeroOccupation() {
        PootieTang pootie = new PootieTang();
        String expected = "Musician and actor";
        String actual = pootie.getOccupation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBladeEmail() {
        PootieTang pootie = new PootieTang();
        String expected = "Pootie@crighty.pooster";
        String actual = pootie.getEmail();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testBladeAlignment() {
        PootieTang pootie = new PootieTang();
        String expected = "True Good";
        String actual = pootie.getHeroAlignment();
        Assert.assertEquals(expected, actual);
    }
}
