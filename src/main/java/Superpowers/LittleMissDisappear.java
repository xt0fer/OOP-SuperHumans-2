package Superpowers;

public class LittleMissDisappear extends Superhuman implements Attack {
    public LittleMissDisappear() {
        Superhuman littleMissDiappear = new Superhuman();
        littleMissDiappear.name = "Violet Parr";
        littleMissDiappear.age = 14;
        littleMissDiappear.gender = "female";
        littleMissDiappear.phoneNumber = "333-333-3333";
        littleMissDiappear.email = "violet@incredibleINC.com";
        littleMissDiappear.occupation = "Student";
        littleMissDiappear.address = "105 Incredible Lane, New York, NY, 11115";
        littleMissDiappear.good = true;
        littleMissDiappear.heroName = "Little Miss Disappear";
        littleMissDiappear.addSuperAbility("invisibility");
        littleMissDiappear.addSuperAbility("force fields");
        littleMissDiappear.addSuperAbility("levitation");
        littleMissDiappear.printProfile();
    }
    public String costume(){
        return "invisability";
    }

    public String attack(){
        return "kick";
    }

    public String enemy() {
        return "Syndrome";
    }
}
