import java.util.*;
class LinkedListNode {
    int data;
    LinkedListNode next;
    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }
}
public class Rotate_array {
    public static LinkedListNode createSinglyLinkedList(int[] input) {
        LinkedListNode head = null;
        LinkedListNode tail = null;
     for (int i : input) {
            LinkedListNode newNode = new LinkedListNode(i, null);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        } 
        return head;
    }
    public static LinkedListNode leftRotate(LinkedListNode head, int k) {
        if (head == null || k <= 0 || head.next == null) {
            return head;
        } else {
            int i = 1;
            while (i <= k) {
                LinkedListNode current = head;
                while (current.next != null) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    current = current.next;
                }
                i++;
            }
            return head;
        }
    }
    public static void main(String[] args) {
        int[] x = {1, 3, 5, 7, 9, 11};
        System.out.println(Arrays.toString(x));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations: ");
        int n = sc.nextInt();
        LinkedListNode head = createSinglyLinkedList(x);
        System.out.println("Original Linked List:");
        for (LinkedListNode temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data+" ");
        }
        head = leftRotate(head, n);
        System.out.println("\n"+"Rotated Linked List:");
        for (LinkedListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data+" ");
        }
        sc.close();
     }
}