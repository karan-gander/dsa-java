import java.util.*;

public class Queuetwostacks {

    static class Queue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        public void add(int data) {
            
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int peek() {

            if (isEmpty()) {
                return -1;
            }

            return s1.peek();
        }

        public int pop() {

            if (isEmpty()) {
                return -1;
            }

            return s1.pop();
        }
    }

    public static void main(String args[]) {

        Queue q = new Queue();

        q.add(5);
        q.pop();
        q.add(2);

        System.out.println(q.isEmpty());
        System.out.println(q.peek());

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " --");
            q.pop();
        }
    }
}