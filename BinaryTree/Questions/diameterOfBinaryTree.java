package Java.BinaryTree.Questions;

public class diameterOfBinaryTree {
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

    // O(n ^ 2) - because self ke liye bhi call dena pdhra hai so iska solution hai
    // ki ek class lelo aur height bhi return kra lo than tc : o(n) hojayegi
    // class Solution {
    // public int diameterOfBinaryTree(TreeNode root) {
    // if (root == null) {
    // return 0;
    // }
    // int ld = diameterOfBinaryTree(root.left);
    // int rd = diameterOfBinaryTree(root.right);
    // int sd = ht(root.left) + ht(root.right) + 2;
    // return Math.max(sd, Math.max(ld, rd));
    // }

    // public int ht(TreeNode root) {
    // if (root == null) {
    // return -1;
    // }
    // int lh = ht(root.left);
    // int rh = ht(root.right);
    // return Math.max(lh, rh) + 1;
    // }
    // }

    // O(n)

    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root).ld;
        }

        public DiaPair diameter(TreeNode root) {
            if (root == null) {
                return new DiaPair();
            }

            DiaPair ldp = diameter(root.left);
            DiaPair rdp = diameter(root.right);
            int sd = ldp.hi + rdp.hi + 2;
            DiaPair sdp = new DiaPair();
            sdp.hi = Math.max(ldp.hi, rdp.hi) + 1;
            sdp.ld = Math.max(sd, Math.max(ldp.ld, rdp.ld));
            return sdp;
        }

    }

    class DiaPair {
        int ld = 0;
        int hi = -1;
    }

}
