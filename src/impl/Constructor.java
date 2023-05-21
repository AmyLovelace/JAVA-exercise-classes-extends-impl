package impl;

import interfaces.ManualJob;
import interfaces.Team;
import interfaces.Test;
import people.People;

public class Constructor extends People implements ManualJob, Team, Test {

    private boolean harassesPedestrians = true;
    private  int salary;

    public Constructor(String name, String race, int age, boolean harassesPedestrians, int salary) {
        super(name, race, age);
        this.harassesPedestrians = harassesPedestrians;
        this.salary = salary;
    }

    public boolean isHarassesPedestrians() {
        return harassesPedestrians;
    }

    public void setHarassesPedestrians(boolean harassesPedestrians) {
        this.harassesPedestrians = harassesPedestrians;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void makesManualJob() {
        System.out.println("I work with my hands, a macho macho man");

    }

    @Override
    public void worksInTeams(int colleagues) {
        System.out.println("all " + colleagues + " of my mates are fat bastards");

    }

    @Override
    public void makesTests() {
        System.out.println("i have to test the durability of the construction");

    }

    @Override
    public void eats() {
        System.out.println("I like to eat Tacos");

    }

    @Override
    public String toString() {
        return "Constructor{" +
                "harassesPedestrians=" + harassesPedestrians +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                '}';
    }
}
