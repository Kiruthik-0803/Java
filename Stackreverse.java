import java.util.Stack;
public class Stackreverse {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node reverse(Node node) {
        Stack<Node> stack = new Stack<>();
        Node current = node;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
        
        Node newHead = stack.pop();
        Node temp = newHead;
        
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        
        temp.next = null; 
        return newHead;
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
        Stackreverse list = new Stackreverse();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.printList(head);
        head = list.reverse(head);
        list.printList1(head);
    }
}