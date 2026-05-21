package queue;

public class QueueLinked {

    static class Node {
        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next=null;
        }

    }

    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {

        return head == null && tail == null;
    }

    public static void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.print("Queue is empty");
            return -1;
        }

        Node front = head;
        if(head==tail){
            head =tail=null;
        }else{

            head = head.next;
        }
        return front.data;

    }

    public static int peek() {
        if (isEmpty()) {
            System.out.print("Queue is empty");
            return -1;
        }

        return head.data;

    }


    public static void main(String args[]){

        QueueLinked q = new QueueLinked();

        q.add(5);
        q.add(5);
        q.add(2);
        q.add(1);
        q.remove();
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }

}
