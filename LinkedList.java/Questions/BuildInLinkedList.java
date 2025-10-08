import java.util.*;

public class BuildInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);// add last
        ll.addLast(20);// same as add
        ll.addFirst(0);
        ll.add(1, -9);// 1 index pr -9
        System.out.println(ll);
        System.out.println(ll.peek());// getFirst()
        System.out.println(ll.getLast());
        ;
        System.out.println(ll.get(1));
        System.out.println(ll.remove());// removeFirst
        System.out.println(ll.poll());// remove()
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll.remove(1));
    }
}
