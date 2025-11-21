package learning.practices.src.linkedList;

public class Doublyll {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addNode(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Doublyll l = new Doublyll();
        l.addNode(11);
        l.addNode(12);
        l.addNode(13);
        l.addNode(14);
        l.print();
        System.out.println(size);
        // int val = removeFromFirst();
        // l.print();
        // System.out.println(val);
        // System.out.println(size);

        l.reverse();
        l.print();
    }

    public static void reverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (size == 1) {
            return;
        }
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static int removeFromFirst() {
        if (head == null) {
            System.out.println("List is empty!!");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int ans = head.data;
            head = tail = null;
            size--;
            return ans;

        }
        int ans = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return ans;
    }
}