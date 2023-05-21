package people;

public abstract class People {
    protected String name;
    protected String race;
    protected int age;
    protected static boolean isHuman = true;
    public static String country = "Unknown" ;

    public People(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHuman() {
        return isHuman;
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

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        People.country = country;
    }

    public abstract  void  eats();

    public void sleeps(){
        System.out.println(name + " sleeps");
    }

    public static boolean isAlive() {
        return true;
    }

}
