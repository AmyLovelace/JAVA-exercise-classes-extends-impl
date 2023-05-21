import impl.*;

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
        System.out.println(bob.isHuman());
        System.out.println(bob);
        System.out.println(Constructor.isAlive());
        Constructor.setCountry("Chile");
        System.out.println(Constructor.getCountry());

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
        System.out.println(Pedro.isHuman());
        System.out.println(Pedro);
        System.out.println(Cooker.isAlive());
        Constructor.setCountry("Chile");
        System.out.println(Cooker.getCountry());

        Developer Adel = new Developer("Adel", "Latino", 34,2000000,false);
        System.out.println(Adel.getName());
        System.out.println(Adel.getRace());
        System.out.println(Adel.getAge());
        System.out.println(Adel.getSalary());
        Adel.setSalary(2000000);
        Adel.eats();
        Adel.sleeps();
        Adel.worksInTeams(5);
        Adel.makesTests();
        Adel.usesScreen();
        System.out.println(Adel.isHuman());
        System.out.println(Adel);
        System.out.println(Developer.isAlive());
        Constructor.setCountry("Chile");
        System.out.println(Developer.getCountry());

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
        System.out.println(Andy.isHuman());
        System.out.println(Andy);
        System.out.println(Electrician.isAlive());
        Constructor.setCountry("Chile");
        System.out.println(Electrician.getCountry());

        Secretary Gertrudis = new Secretary("Gertrudis", "Latino", 38,580000);
        System.out.println(Gertrudis.getName());
        System.out.println(Gertrudis.getRace());
        System.out.println(Gertrudis.getAge());
        System.out.println(Gertrudis.getSalary());
        Gertrudis.setSalary(2000000);
        Gertrudis.eats();
        Gertrudis.sleeps();
        Gertrudis.makesManualJob();
        Gertrudis.worksInTeams(5);
        Gertrudis.usesScreen();
        System.out.println(Gertrudis.isHuman());
        System.out.println(Gertrudis);
        System.out.println(Secretary.isAlive());
        Constructor.setCountry("Chile");
        System.out.println(Secretary.getCountry());

        Teacher Monica = new Teacher("Monica", "Latino", 56,690000);
        System.out.println(Monica.getName());
        System.out.println(Monica.getRace());
        System.out.println(Monica.getAge());
        System.out.println(Monica.getSalary());
        Monica.setSalary(2000000);
        Monica.eats();
        Monica.sleeps();
        Monica.makesManualJob();
        Monica.worksInTeams(5);
        Monica.usesScreen();
        System.out.println(Monica.isHuman());
        System.out.println(Monica);
        System.out.println(Teacher.isAlive());
        Constructor.setCountry("Chile");
        System.out.println(Teacher.getCountry());





    }
}