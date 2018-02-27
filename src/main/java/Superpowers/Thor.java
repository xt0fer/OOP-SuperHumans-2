package Superpowers;

public class Thor extends SuperHuman implements Abilities {
    public Thor() {

        SuperHuman Thor = new SuperHuman();
        Thor.name = "Thor";
        Thor.good = true;
        Thor.heroName = "Thor";
        Thor.age = 10;
        Thor.gender = "Male";
        Thor.phoneNumber = "What phone???";
        Thor.email = "thor.shield@Marvel.gov";
        Thor.occupation = "Thunder God";
        Thor.address = "Asgard";
        Thor.setPower("Super strength");
        Thor.setPower("Control weather");
        Thor.setPower("Can fly");
        Thor.rapSheet();
    }

    @Override
    public String weakness() {
        return "None";
    }

    @Override
    public String weapon() {
        return "Mjolnir";
    }

    @Override
    public String catchPhrase() {
        return "Odin's beard!";
    }

    @Override
    public String nemisis() {
        return "His Sister - Hela";
    }

    @Override
    public String mainAttack() {
        return "Lightning";
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean bulletProof() {
        return true;
    }

    @Override
    public boolean breathInSpace() {
        return true;
    }
}