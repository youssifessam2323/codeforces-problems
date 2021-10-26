package com.joework.leetcode;
// not completed
class FindTheKthSmallestValueInBST{
    
    public int kthSmallest(TreeNode node, int k) {
      if(node == null){
          return 0;
      }

      int left = kthSmallest(node.left,k);

      if(left != 0){
        return left;
      }

      k--;
      
      if(k == 0 ){
          return node.val;
      }

      int right = kthSmallest(node.right,k);

      return right;
    }


   
    public static void main(String[] args){

        TreeNode n4 = new TreeNode(1, null, null);
        TreeNode n3 = new TreeNode(2, n4, null);
        TreeNode n1 = new TreeNode(4, null, null);
        TreeNode n2 = new TreeNode(3, n3, n1 );
        TreeNode n5 = new TreeNode(6, null, null );
        TreeNode root = new TreeNode(5,n2,n5);

        FindTheKthSmallestValueInBST f = new FindTheKthSmallestValueInBST();

       System.out.println(f.kthSmallest(root, 3));



    }

}