package impl;

import interfaces.ManualJob;
import interfaces.Screen;
import interfaces.Team;
import people.People;

public class Secretary extends People implements Screen, ManualJob, Team {
    private int salary;

    public Secretary(String name, String race, int age, int salary) {
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
        System.out.println("only to my boss");

    }

    @Override
    public void usesScreen() {
        System.out.println("all day im in front of a screen responding emails");

    }

    @Override
    public void worksInTeams(int colleagues) {
        System.out.println("all "+ colleagues +" of my colleagues are fat whores");

    }

    @Override
    public void eats() {
        System.out.println("theres a nice lady that brings my lunch to the office");

    }

    @Override
    public String toString() {
        return "Secretary{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                '}';
    }
}
