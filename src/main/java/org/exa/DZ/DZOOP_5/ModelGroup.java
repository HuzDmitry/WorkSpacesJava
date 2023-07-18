package org.exa.DZ.DZOOP_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ModelGroup {
    private List<Group> groupList;

    public ModelGroup() {
        this.groupList = new ArrayList<>();
    }
    public boolean addGroup(String group){
       if (!isGroup(group)) {
           groupList.add(new Group(group));
           return true;
       }else 
           return false;
    }
    private boolean isGroup(String name){
        boolean flag;
        for (Group g : groupList) {
            if(g.getNameGroup().equals(name)){
                return true;
            }
        }
        return false;
    }
    public List<Group> getGroupList() {
        return List.copyOf(groupList);
    }
    public boolean addStudentInGroup(String nameStudent, String nameGroup){
        boolean f = groupList.stream()
                .filter(g->Objects.equals(g.getNameGroup(),nameGroup))
                .anyMatch(g->g.addStudent(nameStudent));
        return f;
    }
    public List<Student> getAllStudentInGroup(String nameGroup){
        List<Student>student = groupList.stream()
                .filter(s-> Objects.equals(s.getNameGroup(), nameGroup))
                .map(Group::getStudent)
                .findAny().orElse(null);
        return student;
    }
}
