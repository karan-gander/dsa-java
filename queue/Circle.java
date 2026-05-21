// package queue;

public class Circle {

    static class Cqueue {

        static int arr[];
        static int size;
        static int front, rear;

        Cqueue(int n) {

            arr = new int[n];
            front = -1;
            rear = -1;
            size = n;
        }

        public static boolean isEmpty() {

            return ((front == -1) && (rear == -1));
        }

        public static void add(int data) {

            if ( ((rear + 1) %size)==front) {
                System.out.print("Queue is full ");
                return;
            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        public static int remove() {

            if (isEmpty()) {
                System.out.print("Queue is empty ");
                return -1;
            }

            int result = arr[front];

            if (front == rear) {

                front = rear = -1;
            } else {
                front = (front + 1) % size;

            }

            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.print("Queue is empty");

                return -1;
            }

            return arr[front];
        }

    }

    public static void main(String args[]) {

        Cqueue cq = new Cqueue(3);
        cq.add(5);
        cq.add(4);
        cq.add(2);
        // cq.remove();
        // cq.add(4);

        while (!cq.isEmpty()) {
            System.out.print(cq.peek()+" ");
            cq.remove();
        }
    }

}
