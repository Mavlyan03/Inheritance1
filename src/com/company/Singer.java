package com.company;

public class Singer extends Person {
    private String bandName;

    public String singing() {
        return name + " like singing";
    }
    public String playGuitar() {
        return name + " can play on the guitar";
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.name = name;
        this.designation = designation;
        this.bandName = bandName;
    }

    @Override
    String eat() {return name + " like to eat sushi";}

    @Override
    String walk() {return name + " like to walk on the beach";}

    @Override
    String learn() {return name + " like to learn french";}

    @Override
    public String toString() {
        return "Name: " + name + ", Designation: " + designation + ", Band name: " + bandName;
    }
}
