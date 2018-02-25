package Superpowers;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
    private String name = " ";
    private String gender = " ";
    private String occupation = " ";
    private String address = " ";
    private String email = " ";
    private String phonenumber = " ";
    private int age = 0;


    public Human() { //just blank constructor, needs no param.
    }
    public Human(String name, String gender, String email, String occupation, String address, String phonenumber, Integer age)
    {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public String getName() { //accessor method, have access to the values in the Human method;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getphonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}