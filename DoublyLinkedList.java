import java.util.Arrays;
class LinkedListNode {
    LinkedListNode prev;
    int data;
    LinkedListNode next;
    public LinkedListNode(LinkedListNode prev,int data, LinkedListNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;       
    }
}
public class DoublyLinkedList {
    public static LinkedListNode createDoublyLinkedList(int[] input) {
        LinkedListNode prev = null;
        LinkedListNode head = null;
        LinkedListNode tail = null;
        
        for (int i : input) {
            LinkedListNode newNode = new LinkedListNode(null, i, null);
            
            if (head == null) {
                prev=null;
                head = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
            }
            
            tail = newNode;
        }
        
        return head;
    }
    public static void main(String[] args) {
        int[] x = {1, 5, 7, 9};
        System.out.println(Arrays.toString(x));
        LinkedListNode head = createDoublyLinkedList(x);
        for (LinkedListNode temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
    }
}
