package general.LLD.vendingmachine;

public class DispenseChange implements State{

    private VendingMachine vendingMachine;


    public DispenseChange(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void collectCash(int cash) {
    //collected cash
    }

    @Override
    public void dispenseChange(String productCode) {
    //dispensed Changes
    }

    @Override
    public void dispenseItem(String productCode) {

    }

    @Override
    public void cancelTransaction() {

    }

    public static class Coin {
    }

    public static class Product {

        String name;
        Integer price;



    }
}
