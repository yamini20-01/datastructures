package Testing;

public class Animal implements  Cloneable{

    String type ;
    String name ;
    int noOfLegs ;

    public Animal(String type, String name, int noOfLegs) {
        this.type = type;
        this.name = name;
        this.noOfLegs = noOfLegs;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
