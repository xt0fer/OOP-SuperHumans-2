package Superpowers;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
    public Integer age;
    public String name;
    public String gender;
    public String occupation;
    public String address;
    public String email;
    public String phoneNumber;

    //constructor
    public Human(){

    }

    public Human (String name, Integer age, String gender, String occupation, String address, String email, String phoneNumber){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.occupation = occupation;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getOccupation(){
        return occupation;
    }

    public String getAddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


}