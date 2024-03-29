public class Node {
    
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        llist.head.next = new Node(2);
        llist.head.next.next = new Node(3);
        llist.head.next.next.next = new Node(4);
        llist.head.next.next.next.next = new Node(5);
        public Node(int d) {
            data = d;
            next = null;
            
        }
    

        System.out.println("Given list:");
        llist.printList();

        int k = 2; 
        llist.leftRotate(k);

        System.out.println("Rotated Linked List:");
        llist.printList();
    }
} 
    int data;
    Node next;


class LinkedList {
    Node head;

    public void leftRotate(int k) {
        if (head == null || k <= 0 || head.next == null) {
            return;
        }

        Node curr = head;
        for (int i = 0; i < k - 1; ++i) {
            curr = curr.next;
            if (curr == null) {
                return;
            }
        }

        Node newHead = curr.next;
        curr.next = newHead.next;
        newHead.next = head;
        head = newHead;
    }
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}