package org.exa.DZ.DZ4;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsoleList {
    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, то программа завершается
     *
     *
     * > - ввод в консоль (stdin), < - вывод на консоль (stdout)
     * > java
     * > python
     * > c#
     * > print
     * < [c#, python, java]
     * > revert
     * > print
     * < [python, java]
     * > revert
     * > revert
     * > print
     * < []
     * > revert -> throw new NoSuchElementException
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean exit= true;
        while (exit) {
            String command = scan.nextLine();
            switch (command){
                case "print":
                {
                    System.out.println("print "+list);
                   // System.out.println(list);
                    break;
                }
                case "revert":
                {
                    System.out.println("delete");
                    list.pop();
                    break;
                }
                case "exit":
                {
                    exit=false;
                    System.out.println("exit");
                    break;
                }
                default:
                {
                    System.out.println("add");
                    list.push(command);
                }
            }
        }
    }
}
