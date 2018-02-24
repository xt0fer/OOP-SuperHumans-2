package Superpowers;

public class SuperMan extends SuperHuman implements SuperStrength{

    public SuperMan() {
        super();

        SuperHuman superMan = new SuperHuman();

        superMan.setName("Clark Kent");
        superMan.setAddress("Metropolis");
        superMan.setAge(28);
        superMan.setGender("M");
        superMan.setHeroName("SuperMan");
        superMan.setOccupation("journalist");
        superMan.setPhoneNumber("19331933");
        superMan.setGood(true);
        superMan.setEmail("superman@gmail.com");

    }

    @Override
    public void flipCar() {
        System.out.println(this.heroName + "not today Lex Luthor");
    }
}
