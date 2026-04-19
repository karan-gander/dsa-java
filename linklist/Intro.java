
public class Intro {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");

            temp = temp.next;

        }
    }

    public void add(int index, int data) {
        Node temp = head;
        int i = 0;
        Node newNode = new Node(data);
        size++;

        if (index == 0) {
            addFirst(data);
            return;
        }

        while (i < index - 1) {

            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {

        if (size == 0) {
            System.out.print("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        size--;
        head = head.next;
        return val;

    }

    public int removeLast() {

        if (size == 0) {
            System.out.print("Linked list is empty");
            return Integer.MIN_VALUE;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;

        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int search(int key) {
        if (size == 0) {
            System.out.print("Linked list is empty");
            return Integer.MIN_VALUE;
        }

        int i = 0;
        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                System.out.println("Key at index");
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

        if (head.data == key) {
            return 0;
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

    public void reverse() {

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

    public void deleteNthEnd(int n) {

        int sz = 0;

        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;

        }

        if (n == sz) {
            head = head.next;
            return;
        }

        int iToN = sz - n;
        int i = 1;
        Node prev = head;
        while (i < iToN) {

            prev = prev.next;
            i++;

        }

        prev.next = prev.next.next;

        return;

    }

    public Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        Node middleNode = findMiddle(head);

        Node prev = null;
        Node curr = middleNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node right = prev;
        Node left = head;

        while (right != null) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;

        }

        return true;

    }

    public boolean isCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }

        }

        return false;

    }

    public void removeCycle() {

        Node slow = head;
        Node fast = head;

        Node prev = null;

        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                cycle = true;
                break;
            }

        }

        if (cycle == false) {
            return;

        }

        slow = head;

        while (fast != slow) {

            prev = fast;

            slow = slow.next;
            fast = fast.next;

        }

        prev.next = null;

    }

    private Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;

    }

    private Node merged(Node head1, Node head2) {

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }

        return mergedLL.next;

    }

    public Node mergedSort(Node head) {
        if (head == null || head.next == null) {

            return head;

        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null; // bracks ll

        Node newLeft = mergedSort(head);
        Node newRight = mergedSort(rightHead);

        return merged(newLeft, newRight);
    }

    public static void main(String args[]) {

        Intro ll = new Intro();
        // ll.print();

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(1);

        // ll.add(2, 4);

        // ll.print();
        // ll.removeFirst();
        // System.out.println();

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head.next;

        // // ll.print();
        // System.out.print(ll.isCycle());
        // ll.removeCycle();
        // System.out.print(ll.isCycle());
        // // ll.reverse();

        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.removeLast());
        // System.out.println(ll.search(10));
        // System.out.println(ll.recSearch(10));
        
        // System.out.println(ll.size);
        
        // System.out.print("null");
        
        
        
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(7);
        ll.addFirst(7);
        ll.addFirst(5);
        ll.addFirst(0);
        
        ll.print();
        ll.mergedSort(head);
        System.out.println();
        ll.print();


    }
}
