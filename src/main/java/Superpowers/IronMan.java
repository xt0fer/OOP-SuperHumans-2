package Superpowers;

public class IronMan extends SuperHuman implements  ModeOfTransportation {

    public IronMan(){
        super("Tony Stark", "Male", "tstark@starkindustries.net",
                "CEO", "123 Point Paradise Way", "3333333333", 32,
                "IronMan", "Rich", true); }

    public String jetPack() { return "JetFuel";}
}



