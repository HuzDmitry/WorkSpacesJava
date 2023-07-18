package org.exa.DZ.DZOOP_5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ViewConsole view = new ViewConsole();
        PresenterGroup presentor = new PresenterGroup(new ModelGroup(), view);
        view.message("программа для создания групп и студентов.");
        StringBuilder builder= new StringBuilder()
                .append("выберите команду:\n")
                .append("1 - создание группы.\n")
                .append("2 - создание студента в группе.\n")
                .append("3 - просмотр групп.\n")
                .append("4 - просмотр студентов в группе.\n")
                .append("0 - выход.\n");
        try (Scanner scanner = new Scanner(System.in)){
            while (true){
                view.message(builder.toString());
                String key = scanner.next();
                switch (key){
                    case "1":
                        presentor.createGroup();
                        break;
                    case "2":
                        presentor.createStudent();
                        break;
                    case "3":
                        presentor.getAllGroups();
                        break;
                    case "4":
                        presentor.getListStudents();
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("такой нет команды");
                        break;
                }

            }
        }

    }

}
