package general.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 5;

        //0,1,1,2,3,5
/*        System.out.println(0);
        printFibonacci(0,1,a);*/

        fib(5);
    }

    private static void printFibonacci(int prev, int current, int a) {

        if (a == 0) {
            return;
        }
        System.out.println(current);
        int temp = current;
        current = prev + current;
        prev = temp;

        a--;
        printFibonacci(prev, current, a);

    }

    static int fib(int n) {
        // Stop condition
        if (n == 0)
            return 0;

        // Stop condition
        if (n == 1 || n == 2)
            return 1;

            // Recursion function
        else
            return (fib(n - 1) + fib(n - 2));
    }
}
