package general.java8;

public class ImmClassChile extends ImmClass{
    ImmClassChile(int age, String name) {
        super(age, name);
    }

    @Override
    public int getAge() {
        return 300;
    }
}
