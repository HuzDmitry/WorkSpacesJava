package org.exa.DZ.DZOOP_2;

public class Hero implements ShowIHealthPoints, ShowManaPoints {
    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    private int maxManaPoint; // максимально количество магический энергии
    private int currentManaPoint; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    @Override
    public int[] HealthPoint() {
        return new int[]{maxHealthPoint, currentHealthPoint};
    }

    @Override
    public int[] ManaPoint() {
        return new int[]{maxManaPoint, currentManaPoint};
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

}
