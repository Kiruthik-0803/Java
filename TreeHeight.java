class Node {
    int key;
    Node left, right;
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
public class TreeHeight {
    public int height(Node node) {
        if (node == null)
            return -1;
        else {
            int lh = height(node.left);
            int rh = height(node.right);
            if (lh > rh)
                return lh + 1;
            else
                return rh + 1;
        }
    }
    public static void main(String[] args) {
        TreeHeight tree = new TreeHeight();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.left.left = new Node(10);
        root.right.right.right = new Node(11);
        root.left.right.left.left = new Node(12);
        System.out.println("Height of the binary tree is: " + tree.height(root));
    }
}
