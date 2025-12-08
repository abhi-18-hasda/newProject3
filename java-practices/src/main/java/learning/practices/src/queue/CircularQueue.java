package learning.practices.src.queue;

public class CircularQueue {
    public static class Queue {
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        private static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!!!");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = - 1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!!!");
                return -1;
            }
            
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(8);
        queue.add(10);
       // queue.add(12);
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
