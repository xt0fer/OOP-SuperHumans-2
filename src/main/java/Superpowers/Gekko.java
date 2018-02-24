package Superpowers;

public class Gekko extends Superhumans{

    private String vehicles;
    private String pet;
    private String allies;




    public Gekko(String vehicles, String pet, String allies) {
        this.name = "Greg Smith";
        this.age = 7;
        this.gender = "Male";
        this.phoneNumber = "989.766.4321";
        this.email = "gg12@gmail.com";
        this.occupation = "Elementary Student";
        this.address = "1 Joann Lane";
        this.hero = true;
        this.heroName = "Gekko";
        this.vehicles = "Gekko Mobile";
        this.pet = "Lionel the Lizard";
        this.allies = "PJ Masks";
    }

    public String powerPhrase() {
        return "Super Gekko muscles";
    }

    public String getVehicles() {
        return vehicles;
    }

    public String getPet() {
        return pet;
    }

    public String getAllies() {
        return allies;
    }
}
