package Superpowers;

public class WonderWoman extends SuperHuman implements SuperStrength {

    public WonderWoman() {
        super();

        SuperHuman wonderWoman = new SuperHuman();

        wonderWoman.setName("Diana Prince");
        wonderWoman.setAddress("Themysceria");
        wonderWoman.setAge(900);
        wonderWoman.setGender("F");
        wonderWoman.setHeroName("Wonder Woman");
        wonderWoman.setOccupation("Goddess of Love and War");
        wonderWoman.setPhoneNumber("19411941");
        wonderWoman.setGood(true);
        wonderWoman.setEmail("wonderwoman@gmail.com");
    }

    @Override
    public void flipCar (){
        System.out.println(this.heroName + "freaking rek'd it");
    }
}
