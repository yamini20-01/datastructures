package general.BinaryTree;

import java.util.ArrayList;
import java.util.List;

//Left ,root, right
public class BinaryTreeTraversal {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println(
                "Preorder traversal of binary tree is ");
        printPreorder(tree);

        System.out.println(
                "\nInorder traversal of binary tree is ");
        printInorder(tree);

        System.out.println(
                "\nPostorder traversal of binary tree is ");
        printPostorder(tree);

    }

    private static void printPostorder(BinaryTree tree) {
    }

    private static void printInorder(BinaryTree tree) {

        List<Integer> list = new ArrayList<>();
        printInorder(tree.root,list);
        list.forEach(System.out::print);

    }

    static void printInorder(Node node, List<Integer> list) {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left, list);

        /* then print the data of node */
       list.add(node.data);

        /* now recur on right child */
        printInorder(node.right, list);
    }

    private static void printPreorder(BinaryTree tree) {
    }
}
