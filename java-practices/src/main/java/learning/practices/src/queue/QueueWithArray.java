package learning.practices.src.queue;

public class QueueWithArray {
    public static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size-1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!!!");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear -= 1;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!!!");
                return -1;
            }
            int front = arr[0];
            return front;
        }

        public static void main(String args[]) {
            Queue queue = new Queue(5);
            queue.add(2);
            queue.add(4);
            queue.add(6);
            queue.add(8);
            queue.add(10);
            queue.add(12);
            while (!queue.isEmpty()) {
                System.out.println(queue.peek());
                queue.remove();
            }

        }
    }
}
