package Superpowers;

public class SuperHuman extends Human {
    String heroName;
    private String power;
    Boolean good;

    public SuperHuman(Boolean good, String heroName, String power) {
       // List<String> Powers;
        this.good = good;
        this.heroName = heroName;
        this.setPower(power);
    }

    public SuperHuman() {
    }

    public Boolean getGood() {
        return good;
        }

    public void setGood(Boolean good) {
        this.good = good;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getPower() {
        return power;
    }

    public void setPowers(String powers) {
        this.addPowers();
    }

    public String addPowers() {
        String addPowers = getPower();
        return getPower();
    }

    protected final String rapSheet() {
        String rapSheet = String.format(
                "Shield classifed database profile: \n\n" +
                "Real Name: %30s \n" +
                "Hero: %30s \n" +
                "Hero Name: %30s \n" +
                "Power: %90s \n" +
                "Age: %30d \n" +
                "Gender: %30s \n" +
                "Phone Number: %30s \n" +
                "E-mail: %30s \n" +
                "Occupation: %30s \n" +
                "Address: %30s \n" + name, getHeroName(), getGood(), phoneNumber, email, occupation, address, good, getPower().toString());
        return this.rapSheet();
    }

    public void setPower(String power) {
        this.power = power;
    }
}

