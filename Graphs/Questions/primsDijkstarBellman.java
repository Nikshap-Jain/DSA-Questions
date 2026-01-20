package Graphs.Questions;

import java.util.*;

public class primsDijkstarBellman {
    static class Graph {
        public HashMap<Integer, HashMap<Integer, Integer>> hm;

        public Graph(int v) {
            hm = new HashMap<>();
            for (int i = 1; i <= v; i++) {
                hm.put(i, new HashMap<>());
            }
        }

        public void AddEdge(int v1, int v2, int w) {
            hm.get(v1).put(v2, w);
            hm.get(v2).put(v1, w);
        }

        public int prims() {
            PriorityQueue<PrimsPair> pq = new PriorityQueue<>(
                    (PrimsPair a, PrimsPair b) -> Integer.compare(a.cost, b.cost));
            HashSet<Integer> visited = new HashSet<>();
            int totalCost = 0;
            pq.add(new PrimsPair(1, 1, 0));
            while (!pq.isEmpty()) {
                // remove
                PrimsPair p = pq.poll();

                // ignore

                if (visited.contains(p.v)) {
                    continue;
                }
                // visit

                visited.add(p.v);

                // self work
                totalCost += p.cost;
                System.out.println(p.v + " " + p.aq + " " + p.cost);

                // unvisited
                for (int i : hm.get(p.v).keySet()) {
                    if (!visited.contains(i)) {
                        pq.add(new PrimsPair(i, p.v, hm.get(p.v).get(i)));
                    }
                }

            }

            return totalCost;

        }

        public void dijkstra() {
            HashSet<Integer> hs = new HashSet<>();
            PriorityQueue<DijPair> pq = new PriorityQueue<>((DijPair a, DijPair b) -> Integer.compare(a.w, b.w));
            pq.add(new DijPair(1, "1", 0));
            while (!pq.isEmpty()) {
                // remove
                DijPair p = pq.poll();

                // ignore
                if (hs.contains(p.v)) {
                    continue;
                }

                // visit

                hs.add(p.v);

                // self work

                System.out.println(p.v + " " + p.p + " " + p.w);

                // unvisited
                for (int i : hm.get(p.v).keySet()) {
                    if (!hs.contains(i)) {
                        pq.add(new DijPair(i, p.p + i, p.w + hm.get(p.v).get(i)));
                    }
                }
            }
        }

        public List<Edge> getEdges() {
            List<Edge> ll = new ArrayList<>();
            for (int v : hm.keySet()) {
                for (int e : hm.get(v).keySet()) {
                    ll.add(new Edge(v, e, hm.get(v).get(e)));
                }
            }
            return ll;
        }

        public int[] bellman(int src) {
            int ans[] = new int[hm.size() + 1];
            for (int i = 1; i < ans.length; i++) {
                ans[i] = 999999;// if infinity taken than it can be overflow
            }
            ans[src] = 0;
            List<Edge> edges = getEdges();
            for (int i = 1; i < hm.size(); i++) {
                for (Edge e : edges) {
                    if (ans[e.v1] != 999999 && ans[e.v2] > ans[e.v1] + e.w) {
                        ans[e.v2] = ans[e.v1] + e.w;
                    }
                }
            }
            return ans;
        }
    }

    static class DijPair {
        int v;
        String p;
        int w;

        public DijPair(int v, String p, int w) {
            this.v = v;
            this.p = p;
            this.w = w;
        }
    }

    static class PrimsPair {
        int v;
        int aq;
        int cost;

        public PrimsPair(int v, int aq, int cost) {
            this.v = v;
            this.aq = aq;
            this.cost = cost;
        }
    }

    static class Edge {
        int v1;
        int v2;
        int w;

        public Edge(int v1, int v2, int w) {
            this.v1 = v1;
            this.v2 = v2;
            this.w = w;
        }
    }

    public static void main(String[] args) {

        Graph g = new Graph(7);
        g.AddEdge(1, 2, 3);
        g.AddEdge(1, 4, 7);
        g.AddEdge(2, 3, 1);
        g.AddEdge(3, 4, 6);
        g.AddEdge(5, 4, 2);
        g.AddEdge(5, 6, 4);
        g.AddEdge(5, 7, 3);
        g.AddEdge(6, 7, 1);
        // g.display();
        // System.out.println(g.prims());
        g.dijkstra();
        int ans[] = g.bellman(1);
        for (int i = 1; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}