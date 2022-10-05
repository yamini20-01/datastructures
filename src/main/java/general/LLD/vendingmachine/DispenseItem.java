package general.LLD.vendingmachine;

public class DispenseItem implements State {

    VendingMachine vendingMachine;

    public DispenseItem(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void collectCash(int cash) {

    }

    @Override
    public void dispenseChange(String productCode) {

    }

    @Override
    public void dispenseItem(String productCode) {

    }

    @Override
    public void cancelTransaction() {

    }
}
