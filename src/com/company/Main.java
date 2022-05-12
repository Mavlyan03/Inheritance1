package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Jake","He is a software developer","Google");
        System.out.println(programmer);
        System.out.println(programmer.eat());
        System.out.println(programmer.walk());
        System.out.println(programmer.learn());
        System.out.println(programmer.coding());

        System.out.println();
        Dancer dancer = new Dancer("Kate","She is a dancer","MTV group");
        System.out.println(dancer);
        System.out.println(dancer.eat());
        System.out.println(dancer.walk());
        System.out.println(dancer.learn());
        System.out.println(dancer.dancing());

        System.out.println();
        Singer singer = new Singer("Ann","She is main singer","Nirvana");
        System.out.println(singer);
        System.out.println(singer.eat());
        System.out.println(singer.walk());
        System.out.println(singer.learn());
        System.out.println(singer.singing());
        System.out.println(singer.playGuitar());
    }
}
