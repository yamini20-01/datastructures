package general.DesignPatterns;

public class StrategyTester {


    public static void main(String[] args) {
        Payment payment = new Payment(new CCStrategy());
        payment.pay();
    }

}
