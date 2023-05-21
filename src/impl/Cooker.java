package impl;

import interfaces.ManualJob;
import interfaces.Team;
import interfaces.Test;
import people.People;

public class Cooker extends People implements ManualJob, Team, Test {

    private int salary;

    public Cooker(String name, String race, int age, int salary) {
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
        System.out.println("every little thing i cook is made with my hands");

    }

    @Override
    public void worksInTeams(int colleagues) {
        System.out.println("all " + colleagues + " of the other chefs are trash");

    }

    @Override
    public void makesTests() {
        System.out.println("we have to taste all the sauces ");

    }

    @Override
    public String toString() {
        return "Cooker{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eats() {
        System.out.println("everyday I eat the same food made in the restaurant");

    }
}
