package org.exa.DZ.DZOOP_1;

public class Dogs extends Animal{
    Dogs(String name, boolean wild, String eat, String speake) {
        super(name, wild, eat, speake);
    }

    @Override
    public void move() {
        System.out.println("Я бегаю на лапах");
    }
}
