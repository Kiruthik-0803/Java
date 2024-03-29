import java.util.Scanner;

class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class RotateList {

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
            return head; // Handle edge cases
        }

        // Find the kth node from the end (new tail) efficiently using two pointers
        int len = 1;
        LinkedListNode temp = head;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        k %= len; // Adjust k to be within list size

        if (k == 0) {
            return head; // No rotation needed if k is 0
        }

        temp = head;
        for (int i = 1; i < len - k; i++) {
            temp = temp.next;
        }

        // Break the list at the kth node (new tail)
        LinkedListNode newTail = temp;
        temp = temp.next;
        newTail.next = null; // Detach new tail

        // **Potential fix: Ensure correct connection between oldTail and new head**
        LinkedListNode oldTail = head;
        while (oldTail.next != newTail) {
            oldTail = oldTail.next;
        }
        oldTail.next = temp; // Connect old tail to new head (was potentially missing)

        // Make the kth node (previously the new tail) the new head
        return temp;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        System.out.println("Original Linked List:");
        printList(createSinglyLinkedList(x));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations: ");
        int n = sc.nextInt();

        LinkedListNode head = leftRotate(createSinglyLinkedList(x), n);

        System.out.println("Rotated Linked List:");
        printList(head);

        sc.close();
    }

    static void printList(LinkedListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
