package HeapOrPriorityQueue;

import java.util.*;

public class heapImplementation {
    static class Heap {
        private List<Integer> ll = new ArrayList();

        public void add(int i) {
            ll.add(i);
            upheapify(ll.size() - 1);
        }

        private void upheapify(int ci) {
            int pi = (ci - 1) / 2;
            if (ll.get(pi) > ll.get(ci)) {
                swap(ci, pi);
                upheapify(pi);
            }
        }

        private void swap(int ci, int pi) {
            int temp = ll.get(ci);
            ll.set(ci, ll.get(pi));
            ll.set(pi, temp);
        }

        public int size() {
            return ll.size();
        }

        public void display() {
            System.out.println(ll);
        }

        public int remove() {
            swap(0, ll.size() - 1);
            int ans = ll.remove(ll.size() - 1);
            downheapify(0);
            return ans;
        }

        private void downheapify(int pi) {
            int lci = (2 * pi) + 1;
            int rci = (2 * pi) + 1;
            int p = pi;
            if (lci < ll.size() && ll.get(p) > ll.get(lci)) {
                p = lci;
            }
            if (rci < ll.size() && ll.get(p) > ll.get(rci)) {
                p = rci;
            }

            if (p != pi) {
                swap(p, pi);
                downheapify(p);
            }
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);
        h.add(7);
        h.add(9);
        h.add(4);
        h.add(2);
        h.add(3);
        h.display();
        h.remove();
        h.display();

    }
}