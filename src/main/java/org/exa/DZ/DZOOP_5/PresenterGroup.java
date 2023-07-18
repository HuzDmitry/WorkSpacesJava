package org.exa.DZ.DZOOP_5;

public class PresenterGroup {
    private ModelGroup model;
    private ViewConsole view;

    public PresenterGroup(ModelGroup model, ViewConsole view) {
        this.model = model;
        this.view = view;
    }
    public void createGroup(){
            boolean f = model.addGroup(view.getName("Создание группы"));
            view.message(String.valueOf(f));
    }
    public void getAllGroups(){
            view.setListGroup(model.getGroupList());
    }
    public void createStudent(){
            boolean f = model.addStudentInGroup(view.getName("создание студента"), view.getName("в какой группе?"));
            view.message(String.valueOf(f));
    }
    public void getListStudents(){
            view.setListStudent(model.getAllStudentInGroup(view.getName("показать какую группу?")));
    }
}
