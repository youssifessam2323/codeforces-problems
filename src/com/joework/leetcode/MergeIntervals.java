package com.joework.leetcode;

import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        int [][] res = new int[intervals.length][];

        for(int i = 0; i < intervals.length;){
            int secondElementInInterval = intervals[i][1];
            int count = 1;
            for(int j = i + 1; j < intervals.length; j++){
                if ( secondElementInInterval >= intervals[j][0]) {
                    res[i] = new int[]{intervals[i][0], intervals[j][1]};
                    count++;
                }
            }
            if(res[i] == null){
                res[i] = intervals[i];
                i++;
            }
            else {
                i += count;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MergeIntervals m = new MergeIntervals();
        System.out.println(Arrays.deepToString(m.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {11, 15}})));
 }
}
