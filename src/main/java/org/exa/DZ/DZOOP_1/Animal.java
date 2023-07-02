package org.exa.DZ.DZOOP_1;

public abstract class Animal {
    private String name;// имя

    private boolean wild; //  дикое (true) или домашнее (false) животное
    private String speake; // какай голос издает
    private String eat; // что ест
    Animal (String name, boolean wild, String eat, String speake){
        this.name=name;

        this.wild=wild;
        this.eat=eat;
        this.speake=speake;
    }
    public void speaks(){
        System.out.println(" Я издаю голос - "+speake);
    } // издает голос
    public void eat(String foot){ // питаеться
        if (eat.equals(foot))
             {System.out.println(" я ем - "+eat);}
        else {
            System.out.println(" я это не ем.");
        }
    }
    public abstract void move(); // двигаеться

    @Override
    public String toString() {
        if (wild)
            return  " Я дикий " + name;
        else
            return " Я домашний "+ name;
    }
}
