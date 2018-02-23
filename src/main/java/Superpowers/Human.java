package Superpowers;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
   private String name = "";
   private String gender = "";
   private String occupation = "";
   private String address = "";
   private int age = 0;

   //constructors
    public Human() {
    }
    public Human(int age) {
        this.age = age;
    }
    public Human (String name){
        this.name = name; }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human(String name, String gender, String occupation, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
    }


    //methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    Formatter outPut = new Formatter();

    //creating Human object
//    public Human averageJoe = new Human("Joe", "man", "CEO", "1234 Easy Street",  18);
//  public Human clarkKent = new Human();


}
