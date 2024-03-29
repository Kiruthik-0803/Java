public class ReverseList {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	Node reverse(Node node)
    {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
	 return prev;
	}
	void printList(Node node)
	{
		System.out.println( "Original list: ");
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println("\n");
	}
	void printList1(Node node)
	{
		System.out.println( "Reversed list: ");
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		ReverseList list = new ReverseList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
        list.printList(head);
        head = list.reverse(head);
        list.printList1(head);
    }
}