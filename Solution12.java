class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;
    DoublyListNode(int val) {
    this.val = val;
    }
}
public class Solution12 {
    public boolean isPalindrome(DoublyLisggggggggggggggggtNode head) {
        if (head == null || head.next == null) {
            return true;    
        }
        DoublyListNode slow = head;
        DoublyListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        DoublyListNode prev = null;
        DoublyListNode nextNode = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            slow.prev = nextNode;
            prev = slow;
            slow = nextNode;
        }
        while (prev != null && head != null) {
            if (head.val != prev.val) {
                return false;
            }
            head = head.next;
            prev = prev.prev; 
        }
        return true;
    }
    public static void main(String[] args) {
        DoublyListNode head = new DoublyListNode(1);
        head.next = new DoublyListNode(2);
        head.next.prev = head;
        head.next.next = new DoublyListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyListNode(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DoublyListNode(1);
        head.next.next.next.next.prev = head.next.next.next;
        Solution12 solution = new Solution12();
        System.out.println("Is the linked list a palindrome? " + solution.isPalindrome(head));
    }
}
