import java.util.ArrayList;
import java.util.List;
class TreeNode {
    int val;
     TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
public class BTtoBBST {
    private void inorderTraversal(TreeNode root, List<Integer> nodes) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, nodes);
        nodes.add(root.val);
        inorderTraversal(root.right, nodes);
    }
    private int[] sortedArray(List<Integer> nodes) {
        int[] arr = new int[nodes.size()];
        for (int i = 0; i < nodes.size(); i++) {
            arr[i] = nodes.get(i);
        }
        return arr;
    }

    private TreeNode sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedArrayToBST(arr, start, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, end);
        return root;
    }
    public TreeNode convertBinaryTreeToBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inorderTraversal(root, nodes);
        int[] sortedArr = sortedArray(nodes);
        return sortedArrayToBST(sortedArr, 0, sortedArr.length - 1);
    }
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);
        root.left.left.left = new TreeNode(1);
        root.left.left.right=new TreeNode(4);
        root.right.right.left = new TreeNode(23);
        root.right.right.right = new TreeNode(30);
        root.right.right.right.left = new TreeNode(27);
        root.right.right.right.right = new TreeNode(35);
        BTtoBBST converter = new BTtoBBST();
        TreeNode bstRoot = converter.convertBinaryTreeToBST(root);
        System.out.println("Inorder traversal of the balanced BST:");
        converter.inorder(bstRoot);
    }
}
