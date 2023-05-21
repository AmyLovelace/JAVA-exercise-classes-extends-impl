import impl.*;

import java.util.Map;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {

        Constructor bob = new Constructor("Bob", "Latino", 28, true, 500000);
        System.out.println(bob.getName());
        System.out.println(bob.getRace());
        System.out.println(bob.getAge());
        System.out.println(bob.isHarassesPedestrians());
        System.out.println(bob.getSalary());
        bob.makesManualJob();
        bob.eats();
        bob.sleeps();
        bob.worksInTeams(5);
        bob.makesTests();
        System.out.println(Constructor.isHuman);
        System.out.println(bob);
        System.out.println(Constructor.isAlive());



        Cooker Pedro = new Cooker("Pedro", "Latino", 34,  500000);
        System.out.println(Pedro.getName());
        System.out.println(Pedro.getRace());
        System.out.println(Pedro.getAge());
        System.out.println(Pedro.getSalary());
        Pedro.setSalary(600000);
        Pedro.makesManualJob();
        Pedro.eats();
        Pedro.sleeps();
        Pedro.worksInTeams(5);
        Pedro.makesTests();
        System.out.println(Cooker.isHuman);
        System.out.println(Pedro);
        System.out.println(Cooker.isAlive());


        Developer adel = new Developer("Adel", "Latino", 34,2000000,false);
        System.out.println(adel.getName());
        System.out.println(adel.getRace());
        System.out.println(adel.getAge());
        System.out.println(adel.getSalary());
        adel.setSalary(2000000);
        adel.eats();
        adel.sleeps();
        adel.worksInTeams(5);
        adel.makesTests();
        adel.usesScreen();
        System.out.println(Developer.isHuman);
        System.out.println(adel);
        System.out.println(Developer.isAlive());
        System.out.println();


        Electrician Andy = new Electrician("Andy", "Latino", 33,500000);
        System.out.println(Andy.getName());
        System.out.println(Andy.getRace());
        System.out.println(Andy.getAge());
        System.out.println(Andy.getSalary());
        Andy.setSalary(2000000);
        Andy.eats();
        Andy.sleeps();
        Andy.worksInTeams(5);
        Andy.makesTests();
        System.out.println(Andy.isWorksCables());
        System.out.println(Electrician.isHuman);
        System.out.println(Andy);
        System.out.println(Electrician.isAlive());


        Secretary gertrudis = new Secretary("Gertrudis", "Latino", 38,580000);
        System.out.println(gertrudis.getName());
        System.out.println(gertrudis.getRace());
        System.out.println(gertrudis.getAge());
        System.out.println(gertrudis.getSalary());
        gertrudis.setSalary(2000000);
        gertrudis.eats();
        gertrudis.sleeps();
        gertrudis.makesManualJob();
        gertrudis.worksInTeams(5);
        gertrudis.usesScreen();
        System.out.println(Secretary.isHuman);
        System.out.println(gertrudis);
        System.out.println(Secretary.isAlive());


        Teacher monica = new Teacher("Monica", "Latino", 56,690000);
        System.out.println(monica.getName());
        System.out.println(monica.getRace());
        System.out.println(monica.getAge());
        System.out.println(monica.getSalary());
        monica.setSalary(2000000);
        monica.eats();
        monica.sleeps();
        monica.makesManualJob();
        monica.worksInTeams(5);
        monica.usesScreen();
        System.out.println(Teacher.isHuman);
        System.out.println(monica);
        System.out.println(Teacher.isAlive());


        System.out.println(Constructor.isHuman);
        System.out.println(Secretary.isHuman);
        System.out.println(Constructor.isHuman);

        Map<String, Object> killed = monica.kills(gertrudis);
        System.out.println(killed);


        Map<String, Object> killed2 = bob.kills(adel);
        System.out.println(killed2);

        boolean soTea = adel.isTea();
        System.out.println(soTea);

        int richBitchorNot = monica.getSalary();
        if (richBitchorNot > 2000000 ){
            System.out.println("no you are not rich");
        } else {
            System.out.println("yes you are rich because you earn " + monica.getSalary() +" dollars");
        }







    }
}