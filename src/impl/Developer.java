package impl;

import interfaces.ManualJob;
import interfaces.Screen;
import interfaces.Team;
import interfaces.Test;
import people.People;

public class Developer extends People implements  Team, Test, Screen {

    private int salary;
    private boolean isTea;

    public Developer(String name, String race, int age, int salary, boolean isTea) {
        super(name, race, age);
        this.salary = salary;
        this.isTea = isTea;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isTea() {
        return isTea;
    }

    public void setTea(boolean tea) {
        isTea = tea;
    }

    @Override
    public void usesScreen() {
        System.out.println("all day im in front of a screen coding");

    }

    @Override
    public void worksInTeams(int colleagues) {
        System.out.println("all" + colleagues + " of my mates are fat bastards");


    }

    @Override
    public void makesTests() {
        System.out.println("i got to test all the applications , but the QA bitches do the rest");

    }

    @Override
    public void eats() {
        System.out.println("I like to eat Ramen");

    }

    @Override
    public String toString() {
        return "Developer{" +
                "salary=" + salary +
                ", isTea=" + isTea +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                '}';
    }
}
