#Justin Butler 10/24/2021
#Using DFS
class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        if (root is None) or (root is p) or (root is q):
            return root
        left = self.lowestCommonAncestor(root.left, p, q)
        right = self.lowestCommonAncestor(root.right, p, q)
        if left is None: 
            return right
        if right is None: 
            return left
        return root
