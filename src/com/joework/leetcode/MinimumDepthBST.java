package com.joework.leetcode;

import javax.print.attribute.standard.RequestingUserName;

// Definition for a binary tree node.

class MinimumDepthBST {


  int findMiniDepth(TreeNode node, int i) { 
      
    if(node == null ){ 
        return Integer.MAX_VALUE;
    }
    if(node.left == null && node.right == null){
          return i;
      }
      
      int leftVal = findMiniDepth(node.left,i+1);
      int leftDep = leftVal == 0 ? i : leftVal;
      int rightVal = findMiniDepth(node.right, i+1);
      int rightDep = rightVal == 0 ? i : rightVal;
      return leftDep < rightDep  ? leftDep : rightDep; 
      
  }
  
  public int minDepth(TreeNode root) {
      if(root == null){
          return  0;
      }
      return findMiniDepth(root,1);
  }

  public static void main(String[] args) {
      MinimumDepthBST m = new MinimumDepthBST();

      TreeNode n4 = new TreeNode(6, null, null);
      TreeNode n3 = new TreeNode(5, null, n4);
      TreeNode n2 = new TreeNode(4, null, n3);
      TreeNode n1 = new TreeNode(3, null, n2);
      TreeNode root = new TreeNode(2,null,n1);

     System.out.println( m.findMiniDepth(root, 1));

  }
}