import java.util.*;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);// enqueue
        System.out.println(q.poll());// remove() : Dequeue
        System.out.println(q.peek());// getFirst : getfront
        System.out.println(q);
    }
}
