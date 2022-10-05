package general.BinaryTree;

public class Height {

    public static void main(String[] args) {
        Node root = new Node(5);
        System.out.println(height(root));
    }

    public static int height(Node node)
    {
        return binaryTreeHeight(node);
    }


    public static int binaryTreeHeight(Node root){
        if(root == null){
            return 0;
        }

        return Math.max(binaryTreeHeight(root.left),binaryTreeHeight(root.right))+1;

    }
}

