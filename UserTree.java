import java.util.Scanner;
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }                                            ,
}
class BinaryTree {
    Node root;
    BinaryTree() {
        root = null;
    }
    
    Node insertNode(Node root, int data) {
        if (root == null) {
           root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertNode(root.left, data);
        else if (data > root.data)
            root.right = insertNode(root.right, data);

        return root;
    }
    void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
}
public class UserTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();
        System.out.println("Enter the values of nodes:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.root = tree.insertNode(tree.root, value);
        }
        System.out.println("Inorder Traversal of the constructed tree:");
        tree.inorderTraversal(tree.root);
    }
}