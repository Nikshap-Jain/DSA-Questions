package Java.BinarySearchTree;

public class Bst {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public Bst(int[] in) {
        root = createTree(in, 0, in.length - 1);
    }

    private Node createTree(int[] in, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node nn = new Node(mid);
        nn.left = createTree(in, si, mid - 1);
        nn.right = createTree(in, ei, mid + 1);
        return nn;
    }
}
