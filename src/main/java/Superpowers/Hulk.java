package Superpowers;

public class Hulk extends Superhumans implements SignatureMoves {

    private String angryColor;
    private String catchPhrase;
    private String allies;


    public Hulk (){
        this.name = "Bruce Banner";
        this.age = 45;
        this.gender = "Male";
        this.phoneNumber = "unknown";
        this.email = "biggreeny@gmail.com";
        this.occupation = "Gamma ray Scientist";
        this.address = "Fiji";
        this.hero = true;
        this.heroName = "Hulk";
        this.angryColor = "Green";
        this.catchPhrase = "Hulk Smash";
        this.allies = "Black Widow";
    }

    public String getAngryColor() {
        return angryColor;
    }

    public void setAngryColor(String angryColor) {
        this.angryColor = angryColor;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getAllies() {
        return allies;
    }

    public void setAllies(String allies) {
        this.allies = allies;
    }

    @Override
    public String finalBlow() {
        return "Hulk Smash";
    }
}



