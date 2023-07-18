package org.exa.DZ.DZOOP_5;

import java.util.List;
import java.util.Scanner;

public class ViewConsole {
    private Scanner scanner;

    public ViewConsole() {
        this.scanner = new Scanner(System.in);
    }

    public String getName(String name) {
        System.out.print(name + " name: ");
        return scanner.nextLine();
    }

    public void setListStudent(List<Student> list) {
        System.out.println("список студентов: " + list);
    }

    public void setListGroup(List<Group> list) {
        System.out.println("список групп: " + list);
    }
    public void message(String msg){
        System.out.println("<<<"+msg+">>>");
    }
}
