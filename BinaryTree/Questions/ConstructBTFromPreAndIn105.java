package Java.BinaryTree.Questions;

public class ConstructBTFromPreAndIn105 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            build(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
        }

        public TreeNode build(int[] pre, int[] in, int ilow, int ihigh, int plow, int phigh) {
            if (ilow > ihigh || plow > phigh) {
                return null;
            }
            TreeNode node = new TreeNode(pre[plow]);
            int idx = search(in, ilow, ihigh, pre[plow]);
            int c = idx - ilow;
            node.left = build(pre, in, ilow, idx - 1, plow + 1, plow + c);
            node.right = build(pre, in, idx + 1, ihigh, plow + c + 1, phigh);
            return node;
        }

        public int search(int[] in, int ilow, int ihigh, int item) {
            for (int i = ilow; i <= ihigh; i++) {
                if (in[i] == item) {
                    return i;
                }
            }
            return 0;
        }
    }
}
