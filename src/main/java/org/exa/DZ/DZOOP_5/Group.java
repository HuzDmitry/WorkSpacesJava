package org.exa.DZ.DZOOP_5;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {
    private final String nameGroup;
    private List<Student> group;

    public Group(String nameGroup) {
        this.group = new ArrayList<>();
        this.nameGroup=nameGroup;
    }
    public boolean addStudent(String name){
        if (!isStudent(name)){
            group.add(new Student(name));
            return true;
        }else
            return false;
    }
    public boolean isStudent(String name){
        for (Student s : group) {
            if(s.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public List<Student> getStudent() {
        return List.copyOf(group);
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public int getCountGroup() {
        return group.size();
    }

    @Override
    public String toString() {
        return "Группа {" +
                "name='" + nameGroup + '\'' +
                '}';
    }

}
