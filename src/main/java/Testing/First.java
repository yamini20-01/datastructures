package Testing;

public interface First {


    default void greet(){

        System.out.println("Greeting from first");
    }
}
