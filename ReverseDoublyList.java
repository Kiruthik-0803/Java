public class ReverseDoublyList {
    static Node head;
    
    static class Node {
        int data;
        Node prev;
        Node next;
        
        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        return prev;
    }

    void printList(Node node) {
        System.out.println("Original list: ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("\n");
    }

    void printList1(Node node) {
        System.out.println("Reversed list: ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next; 
        }
    }

    public static void main(String[] args) {
        ReverseDoublyList list = new ReverseDoublyList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.printList(list.head);
        list.head = list.reverse(list.head);
        list.printList1(list.head);
    }
}
