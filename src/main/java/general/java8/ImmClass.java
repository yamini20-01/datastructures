package general.java8;

public class ImmClass {
    private int age;
    private String name;


    ImmClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
