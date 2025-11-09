package learning.practices.src.linkedList;

public class ZigZagll {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node head;

    public static void main(String args[]) {
        ZigZagll list = new ZigZagll();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printLL();
        zigZagPrint();
        list.printLL();

    }

    private static void zigZagPrint() {

        Node mid = findMid(head);
        // reverse
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // alternate logic
        Node leftNode = head;
        Node righNode = prev;
        Node lh;
        Node rh;
        while (leftNode != null && righNode != null) {
            lh = leftNode.next;
            leftNode.next = righNode;
            rh = righNode.next;
            righNode.next = lh;

            leftNode = lh;
            righNode = rh;
        }
    }

    private static Node findMid(Node head) {
        if (head == null)
            return null; // safety check

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
