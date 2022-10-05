package general.BinaryTree;

public class MirrorCheck {

    public static void main(String[] args) {

        Node root = new Node(5);

        System.out.println(isSymmetric(root));

    }

    public static boolean isSymmetric(Node root) {
        // add your code here;
        return isMirror(root, root);
    }


    public static boolean isMirror(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null && right != null) {
            return false;
        }

        if (left != null && right == null) {
            return false;
        }
        return left != null && right != null && left.data == right.data && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
