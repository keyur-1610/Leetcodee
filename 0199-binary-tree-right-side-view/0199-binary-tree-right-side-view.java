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
    public List<Integer> rightSideView(TreeNode root) {
     List<Integer> myList= new ArrayList<>();
     if(root == null){
        return myList;

     }  
     Queue<TreeNode> Qu= new LinkedList<>();
     Qu.offer(root);
    while(!Qu.isEmpty()){
        int size = Qu.size();
        for(int i=1;i<=size;i++){
            TreeNode nikla = Qu.poll();
             if(i==size){
                myList.add(nikla.val);
             }
            if(nikla.left != null){
                Qu.offer(nikla.left);
            }
            if(nikla.right != null){
                Qu.offer(nikla.right);
            }
        }
    }
       
    return myList;
    }
    
}