package learning.practices.src.linkedList;

public class MergeSortLL {

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
        MergeSortLL list = new MergeSortLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printLL();
        head = mergeSort(head);
        list.printLL();

    }

    private static Node mergeSort(Node list) {
        if (list == null || list.next == null) {
            return list;
        }

        Node mid = findMid(list);
        Node rightHead = mid.next;
        mid.next = null; // split the list

        Node leftSorted = mergeSort(list);
        Node rightSorted = mergeSort(rightHead);

        return merge(leftSorted, rightSorted);
    }

    private static Node merge(Node leftNode, Node rightNode) {
        Node mergell = new Node(-1);
        Node temp = mergell;
        while (leftNode != null && rightNode != null) {
            if (leftNode.data <= rightNode.data) {
                temp.next = leftNode;
                leftNode = leftNode.next;
                temp = temp.next;
            } else {
                temp.next = rightNode;
                rightNode = rightNode.next;
                temp = temp.next;
            }
        }
        if (leftNode != null)
            temp.next = leftNode;
        if (rightNode != null)
            temp.next = rightNode;
        return mergell.next;
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
