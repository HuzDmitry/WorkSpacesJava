package org.exa.DZ.DZOOP_2;

public class Neutral implements ShowIHealthPoints {
    private int maxHealthPoint; // максимально количество здоровья

    private int currentHealthPoint; // текущее количество здоровья

    public Neutral(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    @Override
    public int[] HealthPoint() {
        return new int[]{maxHealthPoint, currentHealthPoint};
    }
//    @Override
//    public int[] ManaPoint() {
//        return null;
//    }
    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

}
