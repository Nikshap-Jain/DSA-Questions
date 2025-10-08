package Java.BinaryTree.Fundamental;

import java.util.*;

public class createTreeUsingLevelOrder {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public void create() {
        createTree();
    }

    private void createTree() {
        Queue<Node> q = new LinkedList<>();
        int item = sc.nextInt();
        Node nn = new Node(item);
        root = nn;
        q.add(nn);
        while (!q.isEmpty()) {
            Node r = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != -1) {
                Node node = new Node(c1);
                r.left = node;
                q.add(node);
            }
            if (c2 != -1) {
                Node node = new Node(c2);
                r.right = node;
                q.add(node);
            }
        }
    }
}
