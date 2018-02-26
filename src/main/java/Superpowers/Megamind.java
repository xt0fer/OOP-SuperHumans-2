package Superpowers;

public class Megamind extends SuperHumans implements Weapons, AddedCommentary, HasFriends{

    public Megamind(){
        super("Megamind", 25, "Male", "3225558912", "Unknown", "Defender of MetroCity", "Megamind's lair, MetroCity", "Megamind", "Genius-level intellect", "Good");
    }

public void wittyComebacks(){
    System.out.println(this.getHeroName() + "always has a quick insult for the hero");
}
public void hasSidekick(){
    System.out.println(this.getHeroName() + "has a minion and best friend called Minion");
}
public void weaponOfChoice(){
    System.out.println(this.getHeroName() + "nevers leaves his lare without his raygun");
}


}
