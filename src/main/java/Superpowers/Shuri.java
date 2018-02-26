package Superpowers;

public class Shuri extends Superhuman implements FightMode {

    public Shuri() {

        SuperHuman shuri = new SuperHuman();

        shuri.setName("Shuri");
        shuri.setAddress("Wakanda");
        shuri.setAge(16);
        shuri.setGender("Female");
        shuri.setHeroName("Shuri");
        shuri.setOccupation("princess");
        shuri.setPhoneNumber("1111111111");
        shuri.setGood(true);
        shuri.setEmail("techie@betterthanbatman.com");
        shuri.setAddress("216 Rainforest Lane");
        shuri.addSuperAbility("Animorphism");
        shuri.addSuperAbility("speed");
        shuri.addSuperAbility("Necromancy");
        shuri.addSuperAbility("Genius-Level Intellect");


    }

    @Override
    public void talkToDead() {
         System.out.println(this.heroName + "what are those!");
    }

    @Override
    public String costume() {
        return "black panther suit";
    }

    @Override
    public String attack() {
        return "turn into a flock of birds";
    }

    @Override
    public String enemy() {
        return "Killmonger";
    }
}
