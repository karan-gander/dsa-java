
// package queue;
import java.util.*;

public class Queuetwostack2 {

    static class Queue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {

            s1.push(data);
        }

        public int pop() {

            while (!s1.empty()) {
                s2.push(s1.pop());

            }

            int data = s2.pop();

            while (!s2.empty()) {
                s1.push(s2.pop());

            }

            return data;

        }

        public int peek() {

            while (!s1.empty()) {
                s2.push(s1.pop());

            }

            int data = s2.peek();

            while (!s2.empty()) {
                s1.push(s2.pop());

            }

            return data;

        }
    }

    public static void main(String args[]) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        q.pop();

        while (!q.isEmpty()) {
            System.out.print(q.peek()+"--");
            q.pop();

        }

    }

}
