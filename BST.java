import java.util.LinkedList;
import java.util.Queue;
class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        root = null;
    }
    void levelOrder() {
        if (root == null) {
            System.out.println("Tree is empty"); 
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        System.out.println(); 
    }
}

public class BST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(8);
        bst.root.left = new Node(3);
        bst.root.right = new Node(10);
        bst.root.left.left = new Node(1);
        bst.root.left.right = new Node(6);
        bst.root.right.left = new Node(12);
        bst.root.right.right = new Node(14);
        System.out.print("Level Order Traversal: ");
        bst.levelOrder();
    }
}
