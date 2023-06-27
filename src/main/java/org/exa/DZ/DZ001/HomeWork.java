package org.exa.DZ.DZ001;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 10)); // true
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(0)); // false
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(1600));//высокосный
        System.out.println(isLeapYear(2012));//высокосный
        System.out.println(isLeapYear(1700));//невысокосный

        int[] arr = createArray(5, 10);
        System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]

        int[] www=createArrays(0,1, 10);//массив с 0 и 1
        System.out.println(Arrays.toString(www));
        byReverse(www);                             //массив инверсия
        System.out.println(Arrays.toString(www));

        int[]result=createArrays(1,10,20); //случайный массив
        System.out.println(Arrays.toString(result));
        isMinInt(result);                               //числа в массиве меньше 6 *2
        System.out.println(Arrays.toString(result));

        int[][]matrix=createMatrix(5);
        System.out.println(Arrays.deepToString(matrix));


        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if (a+b >= 10 && a+b <= 20)
            return true;
        else
            return false;
    }

    private static boolean isPositive(int x) {
        if (x>0)
            return true;
        else
            return false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i=0; i<repeat; i++)
        {
            System.out.print(source);
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if (year%4==0 && year%100!=0)
            return true;
        else if (year%4==0 && year%100==0 && year%400==0)
            return true;
        else
            return  false;
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[]array=new int[len];
        for (int i=0; i<len; i++)
            array[i]=initialValue;
        return array;
    }
    private static int[] createArrays(int first, int last, int len){
        Random ran =new Random();
        int[] array= new int[len];
        if (first<last)
        {
            for (int i = 0; i < len; i++) {
                array[i] = ran.nextInt(first, last+1);
            }
        }
        else
        {
            for (int i=0; i<len; i++) {
                array[i] = ran.nextInt(last, first+1);
            }
        }
        return array;
    }
    private static void byReverse(int[] array){
        for (int t=0; t<array.length; t++) {
            if (array[t]==0)
                array[t]=1;
            else
                array[t]=0;
        }
    }
    private static void isMinInt(int[] array){
        for (int t=0; t<array.length; t++){
            if (array[t]<6)
                array[t]*=2;
        }
    }
    private static int[][] createMatrix(int len){
        int[][]matrix=new int[len][len];
        for (int i=0, j=len-1; i<len && j>=0; i++,j--){
            matrix[i][i]=1;
            matrix[j][i]=1;
        }
        return matrix;
    }

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 *
 * 4. Подготовить вопросы к следующему уроку.
 */
}
