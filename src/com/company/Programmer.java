package com.company;

public class Programmer extends Person {
    private String companyName;



    public String coding() {
        return name + " like coding";
    }

    public Programmer(String name, String designation, String companyName) {
        super(name,designation);
        this.name = name;
        this.designation = designation;
        this.companyName = companyName;
    }

    @Override
    String eat() {return name + " like to eat pizza";}

    @Override
    String walk() {return name + " like to walk on the alley";}

    @Override
    String learn() {return name + " like to learn programming language";}


    @Override
    public String toString() {
        return "Name: "+name+", Designation: "+designation+", Company name: "+companyName;
    }

}
