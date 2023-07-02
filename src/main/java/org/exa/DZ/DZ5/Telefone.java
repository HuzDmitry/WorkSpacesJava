package org.exa.DZ.DZ5;

import java.util.*;

/**
 * Реализовать консольное приложение - телефонный справочник.
 * У одной фамилии может быть несколько номеров.
 * Пользователь может вводить команды:
 * 1. ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
 * 2. GET Ivanov - получить список всех номеров по фамилии
 * 3. REMOVE Ivanov - удалить все номера по фамилии
 * 4. LIST - Посмотреть все записи
 * 5. EXIT - Завершить программу
 * Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
 *
 * Пример взаимодействия (=> - это вывод на консоль):
 * ADD Ivanov 8 800 555 35 35
 * ADD Ivanov 8 800 100 10 10
 * GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
 * ADD Petrov 8 555 12 34
 * LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
 * REMOVE Ivanov
 * LIST => Petrov = [8 555 12 34]
 * GET NoName => Не найдена запись с фамилией "NoName"
 * REMOVE NoName => Не найдена запись с фамилией "NoName"
 */

public class Telefone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите команду...ADD<a, b>, GET<a>, LIST, REMOVE");
        Map<String, List<String>> directory =new HashMap<>();
        while(true)
        {
            String parsers = scan.nextLine();
            analisator(parsers.split(" "), directory);
        }
    }
    public static void analisator(String[]pars, Map<String, List<String>> directory){
        if (pars.length==0) {
            System.out.println("введите команду...ADD<a, b>, GET<a>, LIST, REMOVE");
            return;
        }else {
            switch (pars[0].toUpperCase()) {
                case "ADD": {
                    if (pars.length<3) {
                        System.out.println("нехватает данных для добавления в справочник");
                        break;}
                    if (!directory.containsKey(pars[1])) {
                        directory.put(pars[1], new ArrayList<>(Arrays.asList(pars[2])));
                    }else{
                    List<String> temp=directory.get(pars[1]);
                    temp.add(pars[2]);
                    }
                    System.out.println("добавил.");
                    break;}
                case "GET": {
                    if (pars.length<2){
                        System.out.println("нужно ввести кого искать");
                        break;
                    }
                    System.out.println(directory.get(pars[1]));
                    break;}
                case "LIST": {
                    System.out.println(directory);
                    break;}
                case "REMOVE": {
                    if (pars.length<2){
                        System.out.println("непонятно кого удалить");
                        break;}
                    directory.remove(pars[1]);
                    System.out.println("удалил.");
                    break;}
                case "EXIT":
                {System.exit(1);}
                default:
                    System.out.println("такой команды нет.");
            }
        }

    }
}
