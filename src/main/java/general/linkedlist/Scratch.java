package general.linkedlist;

public class Scratch{

    final int variable = 30;

    public static void main(String[] args)

    {

        final int result = 20;

        final int anotherVar;;

        Scratch f = new Scratch();

        anotherVar = 20;

        System.out.println(anotherVar);

        System.out.println(f.variable);

        System.out.println(f.foo(result));

    }

    int foo(int a)

    {

        return a + 5;

    }

}
