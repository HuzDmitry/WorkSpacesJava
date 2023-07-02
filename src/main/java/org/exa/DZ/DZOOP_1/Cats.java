package org.exa.DZ.DZOOP_1;

public class Cats extends Animal{

    Cats(String name, boolean wild, String eat, String speake) {
        super(name, wild, eat, speake);
    }

    @Override
    public void move() {
        System.out.println("я хожу на лапах");
    }
}
