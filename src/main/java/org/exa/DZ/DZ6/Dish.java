package org.exa.DZ.DZ6;

public class Dish {
    private int food;

    public Dish(){this(100);}

    public Dish(int food) {
        if (food <=0) {
            throw new IllegalArgumentException("food must be positive");
        }
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void increaseFood(int food) {
        if (food > 0) {
            this.food += food;
        }
    }
    public boolean decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "(" + food + ")";
    }
}
