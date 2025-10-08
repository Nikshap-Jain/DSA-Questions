package Java.BinarySearchTree.Questions;

//Don't implement this its just for further question use easy approach to solve it 
public class validateBst98h {
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
            sbp.isbst = lbp.isbst & rbp.isbst & lbp.max < root.val & rbp.min > root.val;
            return sbp;
        }
    }

    class BstPair {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        boolean isbst = true;
    }
}
