package org.exa.DZ.DZOOP_3;

import java.util.Set;
import java.util.TreeSet;

public class MainAppIterator {
    /**
     * Создать класс Контейнер - Container.
     * В контейнере могут быть ящики (класс Box).
     *
     * У каждого ящика есть вес.
     * У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.
     *
     * 1. Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
     * 2. Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
     * 3. Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.
     * <code>
     *     Container c = new Container(...);
     *     // ...
     *     for (Box box: c) {
     *         box - это контейнер
     *     }
     * </code>
     */
    public static void main(String[] args) {
        Set<Container> containers = new TreeSet<>(new ContainerCountComparator());
        int count=10; //количество контейнеров
        for (int i=0; i<count; i++) {
            containers.add(new Container(100, 100));
        }

        System.out.println(containers);

        for (Container r:containers) {
            System.out.println(r + " вес "+r.getWeightContainer());
        }
    }
}
