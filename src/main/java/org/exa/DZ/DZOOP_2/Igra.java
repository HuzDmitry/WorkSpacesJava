package org.exa.DZ.DZOOP_2;

public class Igra {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * Задание
     *
     * Предположим, вы разрабатываете какую-то компьютерную игру, в которой есть несколько типов объектов (классов):
     * 1. Здание (имеет текущий уровень здоровья)
     * 2. Герой (имеет текущий уровень здоровья и текущий уровень магической энергии)
     * 3. Нейтральный персонаж (имеет текущий уровень здоровья)
     *
     * Также у вас есть класс Render с методом showIndicator, который срабатывает при наведении мышки на объект
     * и работает следующим образом:
     * 1. Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * 2. Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей это запись информации в консоль.
     * * То есть вы пишете код, который выводит на консоль информацию.
     *
     *
     * Подсказка: нужно ввести 2 интерфейса: наличие здоровья и наличие магической энергии.
     * В классе Render проверять только на эти интерфейсы и выводить нужную информацию.
     * Необходимо продумать, какие методы должны быть в интерфейсе.
     *
     * ЧТО ДЕЛАТЬ НЕ НУЖНО:
     * Нельзя завязываться на конкретные классы. Предполагается, что таких классов очень много и они постоянно добавляются.
     *
     * * Необязательные задания, которые не относятся к теме, но при сильном желании можно реализовать.
     * * Со звездочкой: реализовать в консоли отображение индикатора.
     * Например, при максимальном уровне здоровья 100 и текущем 40 можно отобразить вот такую ленточку: [xxxx      ]
     * ** С двумя звездочками: раскрасить вывод. Чем меньше здоровья, тем "краснее" цвет индикатора. Для полного здоровья - цвет зеленый.
     */

    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(50);

        Hero hero = new Hero(100,100);
        hero.setCurrentHealthPoint(40);
        hero.setCurrentManaPoint(60);

        Neutral neutral = new Neutral(100);
        neutral.setCurrentHealthPoint(70);

        render.showIndicator(building);
        render.showIndicator(hero);
        render.showIndicator(neutral);// В консоли должно быть примерно так: Текущий уровень здоровья: 50, максимальный уровень здоровья: 100
//
//        System.out.println(ANSI_RED + "This text has a red background but default text!" + ANSI_RESET);
//        System.out.println(ANSI_GREEN + "This text has a green background but default text!" + ANSI_RESET);
    }
}
