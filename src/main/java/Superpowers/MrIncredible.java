package Superpowers;

public class MrIncredible extends Superhuman implements Attack{
    public MrIncredible() {
        Superhuman mrIncredible = new Superhuman();
        mrIncredible.name = "Bob Parr";
        mrIncredible.age = 40;
        mrIncredible.gender = "male";
        mrIncredible.phoneNumber = "111-111-1111";
        mrIncredible.email = "mr_incredible@incredibleINC.com";
        mrIncredible.occupation = "Insurance Claims Adjustor";
        mrIncredible.address = "105 Incredible Lane, New York, NY, 11115";
        mrIncredible.good = true;
        mrIncredible.heroName = "Mr. Incredible";
        mrIncredible.addSuperAbility("enhanced strength");
        mrIncredible.addSuperAbility("enhanced senses");
        mrIncredible.addSuperAbility("enhanced speed");
        mrIncredible.printProfile();
    }

    public String costume(){
        return "protection";
    }

    public String attack(){
        return "kick";
    }

    public String enemy() {
        return "Syndrome";
    }
}
