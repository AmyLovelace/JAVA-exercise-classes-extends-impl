package people;

import java.util.HashMap;
import java.util.Map;

public abstract class People {
    public static boolean isHuman = true;
    protected static String country = "Chile";
    protected String name;
    protected String race;
    protected int age;

    public People(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;

    }

    public static boolean isAlive() {
        return true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public abstract void eats();

    public void sleeps() {
        System.out.println(name + " sleeps");
    }

    public Map<String, Object> kills(People people) {
        Map<String, Object> deadObject = new HashMap<String, Object>();
        deadObject.put("name", people.getName());
        deadObject.put("race", people.getRace());
        deadObject.put("isDead", true);

        System.out.println("acabo de matar a " + people.getName() + " de raza " + people.getRace());

        return deadObject;


    }
}
