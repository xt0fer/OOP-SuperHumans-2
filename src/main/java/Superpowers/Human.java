package Superpowers;

import java.util.Formatter;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {

    protected String name;
    protected int age;
    protected String occupation;
    protected String email;
    protected String address;

    //Default Constructor
    public Human () {}

    //Overloaded Constructor
    public Human (String name, int age, String occupation, String email, String address)
    {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.email = email;
        this.address = address;

    }
    public void setName(String name)
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setOccupation(String occupation)
    {
        this.occupation = occupation;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString()
    {
        Formatter output = new Formatter();
        output.format("Name: %s%nAge: %s%nOccupation: %s%nEmail: %s%nAddress: %s%n",
                this.name, this.age, this.occupation, this.email, this.address);
        return output.toString();
    }


}


