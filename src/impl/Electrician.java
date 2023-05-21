package impl;

import interfaces.ManualJob;
import interfaces.Team;
import interfaces.Test;
import people.People;

public class Electrician extends People implements ManualJob, Team, Test {

    private boolean worksCables = true;
    private int salary;


    public Electrician (String name,String race, int age, int salary){

        super(name,race, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Electrician{" +
                "worksCables=" + worksCables +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public boolean isWorksCables() {
        return worksCables;
    }

    public void setWorksCables(boolean worksCables) {
        this.worksCables = worksCables;
    }

    @Override
    public void eats() {
        System.out.println("I like to eat Tacos");

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
        System.out.println("i have a tester for testing the electricity");

    }


}
