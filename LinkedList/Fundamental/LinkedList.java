package LinkedList.java.Fundamental;

public class LinkedList {
    private class Node {
        int val;
        Node next;

        public Node(int item) {// default mai package se bahar ni jayega
            this.val = item;
        }

        public Node() {

        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int size() {
        return size;
    }

    public void addFirst(int item) {
        Node nn = new Node(item);
        if (size == 0) {
            head = nn;
            tail = nn;

        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(".");
    }

    public void addLast(int item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node();
            tail.next = nn;
            tail = nn;
        }

        size++;
    }

    private Node getNode(int k) {
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void addAtIndex(int item, int k) {
        if (k == 0) {
            addFirst(item);
        } else if (k == size) {
            addLast(item);
        } else {
            Node nn = new Node(item);
            Node prev = getNode(k - 1);
            nn.next = prev.next;
            prev.next = nn;
            size++;
        }
    }

    public int getFirst() {
        return head.val;
    }

    public int getLast() {
        return tail.val;
    }

    public int getAtIndex(int k) {
        return getNode(k).val;
    }

    public int removeFirst() {
        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            temp.next = null;
            size--;
        }
        return temp.val;
    }

    public int removeLast() {
        if (size == 1) {
            return removeLast();
        } else {
            int data = tail.val;
            Node prev = getNode(size - 2);
            prev.next = null;
            tail = prev;
            size--;
            return data;
        }
    }

    public int removeAtIndex(int k) {
        if (k == 0) {
            return removeFirst();
        } else if (k == size - 1) {
            return removeLast();
        } else {
            Node prev = getNode(k - 1);
            Node curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }
    }
}
