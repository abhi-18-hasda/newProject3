package learning.practices.src.linkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // create a new node;
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // new node next is head
        newNode.next = head;
        // head = newNode
        head = newNode;

    }

    public void addLast(int data) {
        // create node;
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // tail next is new node;
        tail.next = newNode;
        tail = newNode;

    }

    public void printLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // temp next is to be newnode of next
        newNode.next = temp.next;
        // temp next is newnode;
        temp.next = newNode;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("List is null can't be deleted");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("List is null can't be deleted");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
    }

    public int itrSearch(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (key == temp.data) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (sz == n) {
            head = head.next; // remove first node
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        System.out.println(iToFind);

        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLL();
        ll.add(2, 3);
        ll.printLL();
        // ll.removeFirst();
        // ll.printLL();
        // ll.removeLast();
        // ll.printLL();
        // System.out.println(size);
        // System.out.println(ll.itrSearch(20));
        // System.out.println(ll.itrSearch(60));

        // System.out.println(ll.recSearch(22));
        // System.out.println(ll.recSearch(60));

        // ll.reverseLL();
        ll.deleteNthFromEnd(5);
        ll.printLL();
    }
}