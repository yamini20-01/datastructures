package Testing;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Tester2 {


    public static void main(String[] args) {


        String str = "RADAR";

        LNode node = new LNode('R');
        node.next = new LNode('A');
        node.next.next = new LNode('D');
        node.next.next.next = new LNode('A');
        node.next.next.next.next = new LNode('R');


        LNode reverseNode = null;
        while (node.next != null) {
            LNode temp = node.next;
            LNode currNode = node;
            LNode nextNode = node.next;
            currNode.next = null;

        }


        List<Employee> employees = new ArrayList<>();


    }


    class Employee {
        int id;
    }

}
