package Testing;

public interface Second {


    default void greet(){

        System.out.println("Greeting from second");
    }
}
