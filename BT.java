class Node {
    int key;
    Node left, right;
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
public class BT {
    public int height(Node node) {
        if (node == null)
            return 0;
        else {
            int lh = height(node.left);
            if (lh==-1) {
                return -1;
            }
            int rh = height(node.right);
            if (rh==-1) {
                return -1;
            }
            int op = Math.abs(lh - rh);
            if (op <= 1 && lh != -1 && rh != -1) {
                return Math.max(lh, rh) + 1;
            } else {
                return -1; 
            }
        }
    }  
    public static void main(String[] args) {
        BT tree = new BT();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        root.left.left.left = new Node(8);
        if (tree.height(root) != -1) {
            System.out.println("It's Balanced tree");
        } else {
            System.out.println("Not a balanced tree");
        }
    }
}