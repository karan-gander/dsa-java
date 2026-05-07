public class Doubly {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    };

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;

    }

    public int removeFirst() {

        if (head == null) {
            System.out.print("Empty Linked List");
            return -1;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;

        return val;

    }

    // home work to write last remove and last addd

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = tail = newNode;
            size++;
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            temp = temp.next;
        }

        newNode.prev = temp;
        temp.next = newNode;

    }

    public int removeLast() {
        if (head == null) {
            System.out.print("Empty Linked List");
            return -1;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node temp = head;

        while (temp.next != null) {

            temp = temp.next;
        }

        int val = temp.data;

        temp.prev.next = null;
        temp.prev = null;
        return val;
    }

    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;

        }
        System.out.print("null");
    }

    public  void reverse(){

        Node prev=null;
        Node curr = head= tail;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
            
        }

        head=prev;
    }

    public static void main(String args[]) {

        Doubly doubleLL = new Doubly();

        doubleLL.addFirst(5);
        doubleLL.addFirst(4);
        doubleLL.addFirst(3);
        doubleLL.addFirst(2);
        doubleLL.addFirst(1);
        // doubleLL.addLast(1);
        // doubleLL.addLast(4);

        doubleLL.print();
    //    int res =  doubleLL.removeLast();
        System.out.println();
        // System.out.print(res);
        // System.out.println();
        doubleLL.print();
        
        System.out.println();
        doubleLL.reverse();
        doubleLL.print();

    }

}
