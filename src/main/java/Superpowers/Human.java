package Superpowers;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {

    protected String address;
    protected Integer age;
    protected String name;
    protected String gender;
    protected String occupation;
    protected String phoneNumber;
    protected String email;

    public Human() {

    }
    public Human(Integer age, String name, String gender, String occupation,
                 String address, String phoneNumber, String email) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        System.out.println(name + age + gender + address + email + occupation + phoneNumber);
    }
    public Human(String name) {

    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
