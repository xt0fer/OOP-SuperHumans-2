package Superpowers;

import java.util.Formatter;

public class SuperHuman extends Human {

    private Boolean isGood;
    private String heroName;
    private String superPower;

    public SuperHuman(){}

    public SuperHuman (String name, int age, String occupation, String email, String address)
    {
    super(name, age, occupation, email, address);
    }

    public SuperHuman (String name, int age, String occupation, String email, String address, Boolean isGood, String heroName, String superPower)
    {
        super(name, age, occupation, email, address);

        this.heroName = heroName;
        this.isGood = isGood;
        this.superPower = superPower;

    }


    public void setIsGood(Boolean isGood)
    {
        this.isGood = isGood;
    }

    public Boolean getIsGood()
    {
        return isGood;
    }

    public void setHeroName(String heroName)
    {
        this.heroName = heroName;
    }

    public String getHeroName()
    {
        return heroName;
    }

    public void setSuperPower(String superPower)
    {
        this.superPower = superPower;
    }

    public String getSuperPower()
    {
        return superPower;
    }

    @Override
    public String toString()
    {
        Formatter output = new Formatter();
        output.format("Name: %s%nAge: %s%nOccupation: %s%nEmail: %s%nAddress: %s%nGood or Evil: %s%nHero Name: %s%nSuperpower(s): %s%n",
                this.name, this.age, this.occupation, this.email, this.address, this.isGood, this.heroName, this.superPower);
        return output.toString();
    }

}
