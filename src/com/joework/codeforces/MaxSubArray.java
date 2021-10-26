package com.joework.codeforces;


class MaxSubArray{
    
    // [-1,3,4,-5,9,-2]

    public int subArray(int[] arr, int start, int end){

        if(start == end ) 
            return arr[start];

        int mid = ( start + end ) / 2;
        int left = subArray(arr, start, mid);
        int right = subArray(arr, mid + 1 , end);
        int cross = crossingSubArray(arr,start,mid,end);

        return Math.max(Math.max(left, right), cross);
    }

    public int crossingSubArray(int[] arr, int start, int mid, int end){

        int i = mid - 1, j = mid + 1 ;
        int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE  ;
        while(i >= start){
            leftSum = Math.max(leftSum, arr[i]);
            i--;
        }
        while (j <= end) { 
            rightSum = Math.max(rightSum, arr[j]);
            j++; 
        }

        return leftSum + rightSum;
    }


    public static void main(String[] args) {
        MaxSubArray m = new MaxSubArray();
        int[] arr = new int[]{-1,3,-4,-5,-9,-2};
       System.out.println(m.subArray(arr, 0, arr.length - 1));


    }
}