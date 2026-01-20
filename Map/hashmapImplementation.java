package Map;

import java.util.ArrayList;
import java.util.List;

public class hashmapImplementation {
    static class HashMap<K, V> {
        class Node {
            K key;
            V value;
            Node next;
        }

        private List<Node> buck;
        private int size;

        public HashMap() {
            this(4);

        }

        public HashMap(int size) {
            buck = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                buck.add(null);
            }
        }

        public void put(K key, V value) {
            Node temp = buck.get(hashFun(key));
            while (temp != null) {
                // every single class (String, Integer, or your own custom class) automatically
                // has a grandparent called the Object class. The Object class contains the
                // .equals() method. so we can compare anything
                if (temp.key.equals(key)) {
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            Node nn = new Node();
            nn.key = key;
            nn.value = value;
            temp = buck.get(hashFun(key));
            nn.next = temp;
            buck.set(hashFun(key), nn);
            size++;
            int threshold = 2;
            if (threshold < ((1.0 * size) / buck.size())) {
                rehashing();
            }
        }

        private void rehashing() {

            List<Node> new_buck = new ArrayList<>();
            List<Node> temp = buck;
            buck = new_buck;
            size = 0;
            for (int i = 0; i < temp.size() * 2; i++) {
                buck.add(null);
            }
            for (Node nn : temp) {
                while (nn != null) {
                    put(nn.key, nn.value);
                    nn = nn.next;
                }
            }

        }

        public V get(K key) {
            Node temp = buck.get(hashFun(key));
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
            return null;
        }

        public boolean containsKey(K key) {
            Node temp = buck.get(hashFun(key));
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        public V remove(K key) {
            Node curr = buck.get(hashFun(key));
            Node prev = null;
            while (curr != null) {
                if (curr.key.equals(key)) {
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
            if (curr == null) {
                return null;
            } else if (prev == null) {
                buck.set(hashFun(key), curr.next);
            } else {
                prev.next = curr.next;
            }
            size--;
            curr.next = null;
            return curr.value;
        }

        private int hashFun(K key) {
            // Every object has hashcode and can be accessed using hashCode() and hashcode
            // range is same as Integer.

            // int idx = Math.abs(key.hashCode()) % buck.size(); // we will not use because
            // it will crash on Integer.MIN_VALUE , it can't make that positive.

            int idx = key.hashCode() % buck.size();

            if (idx < 0) {
                idx += buck.size();
            }
            // Negative Modulo (Walking Backward): In Java, a negative remainder means
            // walking backward from 0. If you get a -1 (remainder), you start at 0 and take
            // 1 step backward. Where do you land? If you step back from 0, you land on the
            // last item (index 3).
            return idx;
        }

        public int size() {
            return size;
        }

        @Override
        public String toString() {
            String s = "{";
            for (Node nn : buck) {
                while (nn != null) {
                    s += "key = " + nn.key + " value =  " + nn.value;
                    nn = nn.next;
                }

            }
            s += "}";
            return s;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(2, "Two");
        hm.put(3, "three");
        hm.put(4, "Four");
        hm.put(5, "Five");
        System.out.println(hm.get(3));
        System.out.println(hm.remove(4));
        System.out.println(hm);
    }
}
