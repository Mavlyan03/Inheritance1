package com.company;

public class Dancer extends Person {
    private String groupName;

    public String dancing() {
        return name + " like dancing";
    }


    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.name = name;
        this.designation = designation;
        this.groupName = groupName;
    }

    @Override
    String eat() {
        return name + " like to eat yogurt";
    }

    @Override
    String walk() {
        return name + " like to walk on the park";
    }

    @Override
    String learn() {
        return name + " like to learn yoga";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Designation: " + designation + ", Group name: " + groupName;
    }
}
