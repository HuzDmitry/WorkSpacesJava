package org.exa.DZ.DZOOP_1;

import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Cats("Мурзик", false, "корм", "Мяу"));
        zoo.add(new Dogs("Жорик", false, "мясо", "Гав"));
        zoo.add(new Hare("Заяц", true, "трава", "Пипи"));
        zoo.add(new Snake("Змея", true, "мясо", "шшшшш"));
        zoo.add(new Cats("Кот", true, "мясо", "Мяу"));
        for (Animal ff : zoo ){
            System.out.print(ff.toString());
            ff.speaks();
        }
        for (Animal ff : zoo ){
            System.out.println("кормлю мясом");
            System.out.print(ff.toString());
            ff.eat("мясо");
            System.out.println("кормлю травой");
            System.out.print(ff.toString());
            ff.eat("трава");
            System.out.println("кормлю кормом");
            System.out.print(ff.toString());
            ff.eat("корм");
        }
    }

}
