package Java.BinaryTree.Fundamental;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.display();
        System.out.println(bt.max());
        System.out.println(bt.find(11));
        System.out.println(bt.ht());
        bt.postOrder();
        bt.preOrder();
        bt.inOrder();
        bt.levelOrder();
    }
}
