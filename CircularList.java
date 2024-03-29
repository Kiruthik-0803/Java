import java.util.Arrays;
class LinkedListNode {
    int data;
    LinkedListNode next;
    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;       
    }
}
public class LinkedList1 {
    public static LinkedListNode createSinglyLinkedList(int[] input) {
        LinkedListNode head = null;
        LinkedListNode tail = head;
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
    public static void main(String[] args) {
        int[] x = {1, 5, 7, 9};
        System.out.println(Arrays.toString(x));
        LinkedListNode head = createSinglyLinkedList(x);
        for (LinkedListNode temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
    }
}