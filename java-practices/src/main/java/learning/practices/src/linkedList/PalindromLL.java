package learning.practices.src.linkedList;

public class PalindromLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printll() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palin() {
        if (head == null || head.next == null) {
            return true;
        }

        // find mid
        Node midNode = findMid(head);
        // reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // compare both half
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void main(String args[]) {
        PalindromLL ll = new PalindromLL();
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(1);
        ll.printll();
        System.out.println();
        System.out.println(ll.palin());
    }

}
