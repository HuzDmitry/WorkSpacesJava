package org.exa.DZ.DZ6;

import java.util.Objects;

public class Cat {

    // private недоступно никому
    // protected доступно внутри пакета + наследование
    // default доступно внутри пакета
    // public доступно всем

    private String name; // поле, содержащее имя кота
    private int appetite; // аппетит кота (столько он съедает за раз)
    private int full; // сытость (голодный 0 или сытый 10)
    private static final int FULL=10;// величина сытости

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        full = 0;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Dish dish) {
        if (full==FULL) {
            return;
        } else if (dish.decreaseFood(appetite)) {
            full=FULL;
        }else {
           int foot=dish.getFood();
           dish.decreaseFood(foot);
           foot=foot*100/appetite;
           full=full+(foot*FULL/100);
        }
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + "satiety? " + "[" + full + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
//            Cat anotherCat = (Cat) obj; // cast
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // if obj1.equals(obj2) => obj1.hashcode() == obj2.hashcode()

    //    // setter
//    public void setName(String catName) {
//        name = catName;
//    }


}
