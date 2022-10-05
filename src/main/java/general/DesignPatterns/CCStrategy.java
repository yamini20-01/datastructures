package general.DesignPatterns;

public class CCStrategy implements  Strategy{


    @Override
    public void pay() {
        System.out.println("Paid through credit card");
    }
}
