package org.exa.DZ.DZOOP_2;

public class Building implements ShowIHealthPoints {
    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    @Override
    public int[] HealthPoint() {
        return new int[]{maxHealthPoint, currentHealthPoint};
    }
//    @Override
//    public int[] ManaPoint() {
//        return null;
//    }
}
