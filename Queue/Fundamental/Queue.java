package Queue.Fundamental;

import java.io.EOFException;

public class Queue {
    int[] arr;
    int front = 0;
    private int size = 0;

    public Queue() {
        this(5);
    }

    public Queue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

    public void enqueue(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Full");
        }
        int idx = (front + size) % arr.length;
        arr[idx] = item;
        size++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty");
        }
        int x = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return x;
    }

    public int getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty");
        }
        return arr[front];

    }

    public void display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}
