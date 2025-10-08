package Java.BinaryTree.Questions;

public class SumRootToLeafNum129 {

    class Solution {
        public int sumNums(TreeNode root) {
            return Numbers(root, 0);
        }

        public int numbers(TreeNode root, int num) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return num * 10 + root.val;
            }
            int left = numbers(root.left, num * 10 + root.val);
            int right = numbers(root.right, num * 10 + root.val);
            return left + right;
        }
    }
}
