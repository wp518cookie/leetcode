package first.tree;

/**
 * @author wuping
 * @date 2019-12-12
 * Given the root of a binary tree, find the maximum value V for which there exists different nodes A and B where V = |A.val - B.val| and A is an ancestor of B.
 * <p>
 * (A node A is an ancestor of B if either: any child of A is equal to B, or any child of A is an ancestor of B.)
 * <p>
 * Input: [8,3,10,1,6,null,14,null,null,4,7,13]
 * Output: 7
 * Explanation:
 * We have various ancestor-node differences, some of which are given below :
 * |8 - 3| = 5
 * |3 - 7| = 4
 * |8 - 1| = 7
 * |10 - 13| = 3
 * Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
 */

public class Maximum_Difference_Between_Node_and_Ancestor_1026 {

    public int maxAncestorDiff(TreeNode root) {
       return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode node, int min, int max) {
        if (node == null) {
            return max - min;
        }
        max = Math.max(node.val, max);
        min = Math.min(node.val, min);
        return Math.max(dfs(node.left, min, max), dfs(node.right, min, max));
    }
}
