package Java.Oops.generix;

import java.util.LinkedList;

public class UniversalLinkedList<T> {
    private class Node {
        T val;
        Node next;

        public Node(T item) {// default mai package se bahar ni jayega
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

    public void addFirst(T item) {
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

    public void addLast(T item) {
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

    public void addAtIndex(T item, int k) {
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

    public T getFirst() {
        return head.val;
    }

    public T getLast() {
        return tail.val;
    }

    public T getAtIndex(int k) {
        return getNode(k).val;
    }

    public T removeFirst() {
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

    public T removeLast() {
        if (size == 1) {
            return removeLast();
        } else {
            T data = tail.val;
            Node prev = getNode(size - 2);
            prev.next = null;
            tail = prev;
            size--;
            return data;
        }
    }

    public T removeAtIndex(int k) {
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

    public static void main(String[] args) {
        UniversalLinkedList<String> ll = new UniversalLinkedList<>();
        ll.addLast("MM");
        ll.addLast("AAS");
        ll.addLast("AAS");
        ll.display();
    }
}
