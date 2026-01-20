package Graphs.Fundamental;

import java.util.*;

public class graphs {
    static class Graph {
        private HashMap<Integer, HashMap<Integer, Integer>> hm;

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

        public boolean containsEd(int v1, int v2) {
            return hm.get(v1).containsKey(v2);
        }

        public boolean containsVer(int v1) {
            return hm.containsKey(v1);
        }

        public int noOfEd() {
            int ans = 0;
            for (int i : hm.keySet()) {
                ans += hm.get(i).size();
            }
            return ans / 2;
        }

        public void remEd(int v1, int v2) {
            hm.get(v1).remove(v2);
            hm.get(v2).remove(v1);
        }

        public void remVer(int v1) {
            for (int i : hm.get(v1).keySet()) {
                hm.get(i).remove(v1);
            }

            hm.remove(v1);
        }

        public void display() {
            for (int i : hm.keySet()) {
                System.out.println(i + " " + hm.get(i));
            }
        }

        public boolean hasPath(int src, int dest) {
            return hp(src, dest, new HashSet<>());
        }

        public boolean hp(int src, int des, HashSet<Integer> visited) {
            if (src == des) {
                return true;
            }

            visited.add(src);

            for (int i : hm.get(src).keySet()) {
                if (!visited.contains(i)) {
                    boolean ans = hp(i, des, visited);
                    if (ans) {
                        return true;
                    }
                }
            }
            return false;

        }

        public void printAllPath(int src, int des, HashSet<Integer> visited, String ans) {
            if (src == des) {
                System.out.println(ans + des);
                return;
            }

            visited.add(src);

            for (int i : hm.get(src).keySet()) {
                if (!visited.contains(i)) {
                    printAllPath(i, des, visited, ans + src);
                }
            }

            visited.remove(src);
        }
        // using bfs to find if path exists

        public boolean bfs(int src, int des) {
            HashSet<Integer> hs = new HashSet<>();
            Deque<Integer> q = new ArrayDeque<>();

            q.add(src);
            while (!q.isEmpty()) {
                // 1. remove
                int temp = q.poll();
                // 2.ignore
                if (hs.contains(temp)) {
                    continue;// this will also tell cycle in graph
                }
                // 3.mark visisted
                hs.add(temp);

                // 4.self work
                if (temp == des) {
                    return true;
                }

                // 5.add unvisited nbrs
                for (int j : hm.get(temp).keySet()) {
                    if (!hs.contains(j)) {
                        q.add(j);
                    }
                }
            }

            return false;
        }

        public boolean dfs(int src, int dest) {
            Deque<Integer> st = new ArrayDeque<>();
            HashSet<Integer> hs = new HashSet<>();
            st.push(src);
            while (!st.isEmpty()) {
                // 1) remove
                int temp = st.pop();

                // 2)ignore
                if (hs.contains(temp)) {
                    continue;
                }

                // 3)visited
                hs.add(temp);

                // 4)self work
                if (temp == dest) {
                    return true;
                }

                // 5)add unvisited
                for (int j : hm.get(temp).keySet()) {
                    if (!hs.contains(j)) {
                        st.push(j);
                    }
                }
            }
            return false;
        }

        public void bft() {
            HashSet<Integer> visited = new HashSet<>();
            Deque<Integer> que = new ArrayDeque<>();

            for (int key : hm.keySet()) {
                if (!visited.contains(key)) {
                    que.add(key);
                    while (!que.isEmpty()) {
                        // 1 remove
                        int temp = que.poll();

                        // 2 ignore
                        if (visited.contains(temp)) {
                            continue;
                        }

                        // 3 visit
                        visited.add(temp);

                        // 4 self work
                        System.out.println(temp);

                        // 5 unvisited
                        for (int i : hm.get(temp).keySet()) {
                            if (!visited.contains(i)) {
                                que.add(i);
                            }
                        }
                    }
                }
            }
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
        g.printAllPath(1, 6, new HashSet<>(), "");
    }
}