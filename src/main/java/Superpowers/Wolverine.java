package Superpowers;

public class Wolverine extends Superhumans{

    private String weapon;
    private String allies;

    public Wolverine(String weapon, String allies) {
        this.name = "Logan";
        this.age = 70;
        this.gender = "Male";
        this.phoneNumber = "656.766.4877";
        this.email = "claws@gmail.com";
        this.occupation = "X-Man";
        this.address = "Xaviers School for Gifted Youth";
        this.hero = true;
        this.heroName = "Wolverine";
        this.weapon = "Retractable Wolverine Claws";
        this.allies = "X - Men";
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getAllies() {
        return allies;
    }

    public void setAllies(String allies) {
        this.allies = allies;
    }
}
