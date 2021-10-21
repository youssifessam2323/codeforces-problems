package com.joework.leetcode;



class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {

        TreeNode root = new TreeNode(preorder[0],null,null);
//        TreeNode curr = root;

        for (int i = 1; i < preorder.length; i++) {
            addNode(root,preorder,i);
        }
        return root;
    }

    private TreeNode addNode(TreeNode node, int[] arr,int i) {
        if(node == null){
            node = new TreeNode(arr[i]);
            return node;
        }

        if(arr[i] < node.val){
            node.left = addNode(node.left,arr,i);
            return node;
        }
        else {
            node.right = addNode(node.right, arr,i);
            return node;
        }
    }



    public static void main(String[] args) {
        int[] arr = {8,5,1,7,10,12};
        Solution s = new Solution();
        
        s.bstFromPreorder(arr);
        
    }
}