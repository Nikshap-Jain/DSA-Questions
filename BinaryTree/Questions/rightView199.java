package Java.BinaryTree.Questions;

import java.util.*;

public class rightView199 {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ll = new ArrayList<>();
            rightView(root, 1, ll);
            return ll;
        }

        public int maxdepth = 0;

        public void rightView(TreeNode root, int curr_level, List<Integer> ll) {
            if (root == null) {
                return;
            }
            if (maxdepth < curr_level) {
                ll.add(root.val);
                maxdepth = curr_level;
            }
            rightView(root.right, curr_level + 1, ll);
            rightView(root.left, curr_level + 1, ll);

        }
    }
}
