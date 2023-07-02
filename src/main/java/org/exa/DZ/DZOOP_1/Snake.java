package org.exa.DZ.DZOOP_1;

public class Snake extends Animal{
    Snake(String name, boolean wild, String eat, String speake) {
        super(name, wild, eat, speake);
    }

    @Override
    public void move() {
        System.out.println("я ползаю.");
    }
}
