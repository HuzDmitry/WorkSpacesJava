package org.exa.DZ.DZOOP_3;

import java.util.Random;

public class Box {
    private final int weight;
    public Box(int weight) {
        Random ran =new Random();
        this.weight = ran.nextInt(weight);
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "вес = "+ weight;
    }
}
