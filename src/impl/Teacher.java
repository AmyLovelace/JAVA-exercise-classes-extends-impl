package impl;

import interfaces.ManualJob;
import interfaces.Screen;
import interfaces.Team;
import interfaces.Test;
import people.People;

public class Teacher extends People implements Team, Test, Screen, ManualJob {

    private int salary;


    public Teacher(String name, String race, int age, int salary) {
        super(name, race, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void makesManualJob() {
        System.out.println("when i do crafts with my students, thats manual job right? ");

    }

    @Override
    public void usesScreen() {
        System.out.println("all the test and exams i do are made in my computer");

    }

    @Override
    public void makesTests() {
        System.out.println("you better study!");

    }

    @Override
    public void eats() {
        System.out.println("i did´nt bring my tupperware to school , i left it on counter");

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void worksInTeams(int colleagues) {
        System.out.println("all "+ colleagues +" of my colleagues are fat whores");

    }
}
