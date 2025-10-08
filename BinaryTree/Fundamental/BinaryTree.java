package Java.BinaryTree.Fundamental;

import java.util.*;

public class BinaryTree {
    private class Node {
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public BinaryTree() {
        root = Create_Tree();
    }

    private Node Create_Tree() {
        int val = sc.nextInt();
        Node nn = new Node(val);
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = Create_Tree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = Create_Tree();
        }

        return nn;
    }

    public void display() {
        display(root);
    }

    public void display(Node node) {
        if (node == null) {
            return;
        }
        String s = "<--" + node.val + "-->";
        if (node.left != null) {
            s = node.left.val + s;
        }

        else {
            s = "." + s;
        }
        if (node.right != null) {
            s = s + node.right.val;
        } else {
            s = s + '.';
        }
        System.out.println(s);
        ;
        display(node.left);
        display(node.right);
    }

    public int max() {
        return max(root);
    }

    private int max(Node nn) {
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(nn.val, Math.max(left, right));
    }

    public boolean find(int item) {
        return find(root, item);
    }

    private boolean find(Node node, int item) {
        if (node == null) {
            return false;
        }
        if (node.val == item) {
            return true;
        }

        boolean left = find(node.left, item);
        boolean right = find(node.right, item);
        return left || right;
    }

    public int ht() {
        return ht(root);
    }

    private int ht(Node node) {
        if (node == null) {
            return -1;
        }

        int lh = ht(node.left);
        int rh = ht(node.right);
        return Math.max(lh, rh) + 1;
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node nn) {
        if (nn == null) {
            return;
        }
        System.out.print(nn.val + " ");
        preOrder(nn.left);
        preOrder(nn.right);
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node nn) {
        if (nn == null) {
            return;
        }
        postOrder(nn.left);
        postOrder(nn.right);
        System.out.print(nn.val + " ");
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node nn) {
        if (nn == null) {
            return;
        }
        inOrder(nn.left);
        System.out.print(nn.val + " ");
        inOrder(nn.right);
    }

    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node r = q.poll();
            System.out.print(r.val + " ");
            if (r.left != null) {
                q.add(r.left);
            }
            if (r.right != null) {
                q.add(r.right);
            }
        }
        System.out.println();
    }

}
