package general.DesignPatterns;

public class Payment {
    Strategy strategy;

    public Payment(CCStrategy ccStrategy) {
        this.strategy = ccStrategy;
    }

    void pay() {
        this.strategy.pay();
    }


}
