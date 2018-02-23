package Superpowers;

public class Elastigirl extends Superhuman implements Attack {


    public Elastigirl() {
        super();

        Elastigirl elastigirl = new Elastigirl();
        elastigirl.name = "Helen Parr";
        elastigirl.age = 37;
        elastigirl.gender = "female";
        elastigirl.phoneNumber = "222-222-2222";
        elastigirl.email = "elastigirl@incredibleINC.com";
        elastigirl.occupation = "Housewife";
        elastigirl.address = "105 Incredible Lane, New York, NY, 11115";
        elastigirl.good = true;
        elastigirl.heroName = "Elastigirl";
        elastigirl.addSuperAbility("elasticity");
        elastigirl.addSuperAbility("shape shifting");
        elastigirl.addSuperAbility("bullet immunity");
        elastigirl.printProfile();

    }

    public String costume(){
        return "elastic";
    }

    public String attack(){
        return "kick";
    }

    public String enemy() {
        return "Syndrome";
    }
}
