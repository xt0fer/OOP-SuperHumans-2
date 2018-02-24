package Superpowers;

public class Dr_Strange extends SuperHuman {
    public Dr_Strange() {

        SuperHuman Dr_Strange = new SuperHuman();
        Dr_Strange.name = "Stephen Strange, MD";
        Dr_Strange.good = true;
        Dr_Strange.heroName = "Dr Strange";
        Dr_Strange.age = 37;
        Dr_Strange.gender = "Male";
        Dr_Strange.phoneNumber = "999-666-7647";
        Dr_Strange.email = "stephen.strange@Marvel.gov";
        Dr_Strange.occupation = "Doctor";
        Dr_Strange.address = "NYC, Greenwich Village";
        Dr_Strange.setPower("Book of Vishanti");
        Dr_Strange.setPower("Stop Time");
        Dr_Strange.setPower("Fly");
        Dr_Strange.rapSheet();
    }
}