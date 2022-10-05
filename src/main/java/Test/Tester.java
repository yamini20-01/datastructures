package Test;

import general.linkedlist.Node;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

public class Tester {

    static AlgorithmA a = null;

    public static void main(String[] args) {

        //String m = "A";
        String n = "254_PK1_IPPD";

        // Returning the hash value of m variable
        System.out.println(n.hashCode() / (100000));

        StringBuilder deleteQuery = new StringBuilder("delete from DocRequest WHERE lastUpdated < DATE_SUB(NOW(), INTERVAL 3 MONTH)");
        System.out.println(deleteQuery.toString());


        Algorithm a = new RatingObjFactory().createObj("a");
        System.out.println(a.hashCode());
        Algorithm a2 = new RatingObjFactory().createObj("a");
        System.out.println(a2.hashCode());
test(123);

    }


    public static void test(int n) {

        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);   start.next.next.next.next.next = new Node(6);

  /*      int a = 1;
   printNodes(start,1);
        System.out.print(start.num);
*/
        String a  = "test";

        String b = new String("test");

        String c = new String("test");

        String d = "test";

        System.out.println(b==c);

        System.out.println(a==c);

        System.out.println(a==d);
    }


    static  void  printNodes(Node start,int a){

        if (start == null)

            return;

        System.out.print(start.num); //Print statement

        if(start.next != null )

            if(a==0){

                printNodes(start.next.next,1);

            }else{

                printNodes(start.next,0);

            }

      //  System.out.print(start.num);
    }

}


