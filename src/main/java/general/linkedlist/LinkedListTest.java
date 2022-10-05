package general.linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        //   revereLinkedList(head);
        //Start from with one speed node and one normal node
        // findMiddleElement(head);
        //Delete node with given value
        DeleteNode(head, new Node(3));
        while (head != null) {
            System.out.println(head.num);
            head = head.next;
        }


    }

    private static void DeleteNode(Node head, Node nodeToBeDeleted) {

        Node prevNodeToDelete = null;
        Node NextNodeToDelete = null;
        while (head.next != null) {
            if (head.next.num == (nodeToBeDeleted.num)) {
                prevNodeToDelete = head;
                NextNodeToDelete = head.next.next;
                break;
            }
            head = head.next;
        }
        System.out.println(NextNodeToDelete.num);
        prevNodeToDelete.next = NextNodeToDelete;
        head = prevNodeToDelete;

    }

    //if node to be deleted is given
    public void deleteNode(Node node) {
        node.num = node.next.num;
        node.next = node.next.next;
    }


    private static void findMiddleElement(Node head) {

        Node regNode = head;
        Node speedNode = head;
        while (head.next != null && speedNode.next != null) {

            head = head.next;
            speedNode = speedNode.next.next;
            if (speedNode == null) {
                break;
            }

        }
        System.out.println(head.num);


    }

    private static void revereLinkedList(Node head) {

        Node current = head;
        Node next = head;
        Node prev = null;
//R -> A ->D ->A -> R

        while (next != null) {
            next = next.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        System.out.println(prev.num);

    }
}
