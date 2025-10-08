package Graphs.Questions;

import java.util.*;

public class validTree {
    class Solution {
        public boolean validtree(int n, int[][] edges) {
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(i, new ArrayList<>());
            }

            for (int i = 0; i < edges.length; i++) {
                int a = edges[i][0];
                int b = edges[i][1];
                map.get(a).add(b);
                map.get(b).add(a);
            }
            return BFT(map);
        }

        private boolean BFT(HashMap<Integer, List<Integer>> map) {
            Queue<Integer> q = new LinkedList<>();
            HashSet<Integer> visited = new HashSet<>();
            int c = 0;
            for (int src : map.keySet()) {
                if (visited.contains(src)) {
                    continue;
                }
                c++;
                q.add(src);
                while (!q.isEmpty()) {
                    // remove
                    int r = q.poll();

                    // ignore

                    if (visited.contains(r)) {
                        return false;
                    }

                    // visited
                    visited.add(r);

                    // add unvisted neighbourse
                    for (int nbrs : map.get(r)) {
                        if (!visited.contains(nbrs)) {
                            q.add(nbrs);
                        }
                    }
                }
            }
            return c == 0;
        }
    }
}
