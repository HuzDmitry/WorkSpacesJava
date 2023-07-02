package org.exa.DZ.DZOOP_1;

public class Hare extends Animal{
    Hare(String name, boolean wild, String eat, String speake) {
        super(name, wild, eat, speake);
    }

    @Override
    public void move() {
        System.out.println("я прыгаю");
    }
}
