package Java.BinarySearchTree.Questions;

public class sum1373 {
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
        public boolean isValidBST(TreeNode root) {
            return validBst(root).isbst;
        }

        public BstPair validBst(TreeNode root) {
            if (root == null) {
                return new BstPair();
            }
            BstPair lbp = validBst(root.left);// left bst pair
            BstPair rbp = validBst(root.right);
            BstPair sbp = new BstPair();
            sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
            sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
            sbp.sum = lbp.sum + rbp.sum + root.val;
            sbp.isbst = lbp.isbst & rbp.isbst & lbp.max < root.val & rbp.min > root.val;
            if (sbp.isbst) {
                sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
            } else {
                sbp.ans = Math.max(lbp.ans, rbp.ans);
            }
            return sbp;
        }
    }

    class BstPair {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        boolean isbst = true;
        int sum = 0;
        int ans = 0;// bst ke us part ka sum jo maximum hai
    }
}
