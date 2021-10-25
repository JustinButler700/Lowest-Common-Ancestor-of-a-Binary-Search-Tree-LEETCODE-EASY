// Justin Butler 10/24/2021
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root == null || root == p || root == q){return root;}
        TreeNode left = lowestCommonAncestor(root.left,p,q);  //DFS and stop at the lowest common ancestor left
        TreeNode right = lowestCommonAncestor(root.right,p,q); //DFS and stop at the lowest common ancestor right
        if(left==null){return right;} // if there isnt a lowest common ancestor at that node, then the ancestor must be the other node.
        if(right==null){return left;}
        return root; // if there are no ancestor nodes to the left or right, then it must be a root node
    }
}
