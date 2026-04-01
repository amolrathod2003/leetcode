// Last updated: 4/1/2026, 10:45:22 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

        /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer>mylist=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
    
        if(root==null){
            return mylist;

        } 
        mylist.add(root.val);
        if(root.left!=null){
           
             preorderTraversal(root.left);
        }
         if(root.right!=null){
           
             preorderTraversal(root.right);
        }
        return mylist;
        
    }
}
        
        
    
