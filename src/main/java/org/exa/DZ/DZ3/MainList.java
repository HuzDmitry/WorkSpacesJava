package org.exa.DZ.DZ3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
//        2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
//        3) Найти максимальное значение
//        4) Найти среднее значение
//
//        То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел,
//        и делает свою работу.
public class MainList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = createList(100, 20);
        System.out.println(integers.toString());
        removeEvenArray(integers);
        System.out.println(integers.toString());
        int result=findMin(integers);
        System.out.println(result);
        result=findMax(integers);
        System.out.println(result);
        double result1=findAverage(integers);
        System.out.println(result1);

    }
    static ArrayList<Integer> createList(int round, int lengcht){
        Random ran = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i<lengcht; i++){
            array.add(ran.nextInt(round));
        }
        return array;
    }
   static void removeEvenArray(ArrayList<Integer> list){
       Iterator count = list.iterator();
       int temp=0;
       while (count.hasNext()){
           temp=(int)count.next();
           if ( temp % 2 == 0)
               count.remove();
       }
   }
   static int findMin(ArrayList<Integer> list){
        Iterator count = list.iterator();
        int min=list.size()*100;
        while (count.hasNext()){
            int temp=(int)count.next();
            if (min>temp)
                min=temp;
        }
        return min;
    }
    static int findMax(ArrayList<Integer> list){
        Iterator count = list.iterator();
        int max=0;
        while (count.hasNext()){
            int temp=(int)count.next();
            if (max<temp)
                max=temp;
        }
        return max;
    }
    static double findAverage(ArrayList<Integer> list){
        Iterator count = list.iterator();
        double average=0;
        while (count.hasNext()){
             int temp=(int)count.next();
           average+=temp;
        }
        average/= list.size();
        return average;
    }
}
