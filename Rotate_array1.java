import java.util.*;
class LinkedListNode {
    int data;
    LinkedListNode next;
    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }
}
public class Rotate_array1 {
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
        }
        int length = 1;
        LinkedListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        k = k % length;
        if (k == 0) {
            return head; 
        }
        int stepsToNewHead = k - 1;
        LinkedListNode current = head;
        while (stepsToNewHead > 0) {
            current = current.next;
            stepsToNewHead--;
        }
        LinkedListNode newHead = current.next;
        current.next = null;
        tail.next = head;

        return newHead;
    }

    public static LinkedListNode rightRotate(LinkedListNode head, int k) {
        if (head == null || k <= 0 || head.next == null) {
            return head;
        }
        int length = 1;
        LinkedListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }
        int stepsToNewHead = length - k;
        LinkedListNode current = head;
        while (stepsToNewHead > 1) {
            current = current.next;
            stepsToNewHead--;
        }
        LinkedListNode newHead = current.next;
        current.next = null;
        tail.next = head;

        return newHead;
    }

    public static void main(String[] args) {
        int[] x = {1, 3, 5, 7, 9, 11};
        System.out.println(Arrays.toString(x));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of left rotations: ");
        int leftRotations = sc.nextInt();
        System.out.println("Enter the number of right rotations: ");
        int rightRotations = sc.nextInt();

        LinkedListNode head = createSinglyLinkedList(x);

        System.out.println("Original Linked List:");
        for (LinkedListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }

        head = leftRotate(head, leftRotations);
        System.out.println("\nLeft Rotated Linked List:");
        for (LinkedListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }

        head = rightRotate(head, rightRotations);
        System.out.println("\nRight Rotated Linked List:");
        for (LinkedListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }

        sc.close();
    }
}
