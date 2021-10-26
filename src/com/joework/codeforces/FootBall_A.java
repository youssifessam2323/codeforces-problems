package com.joework.codeforces;

import java.util.*;
import java.util.Map.Entry;

/**
 * One day Vasya decided to have a look at the results of Berland 1910 Football Championship’s finals.
 * Unfortunately he didn't find the overall score of the match; however,
 * he got hold of a profound description of the match's process. 
 * On the whole there are n lines in that description each of which described one goal.
 * Every goal was marked with the name of the team that had scored it. Help Vasya,
 * learn the name of the team that won the finals.
 * It is guaranteed that the match did not end in a tie.

Input
The first line contains an integer n (1 ≤ n ≤ 100) — the number of lines in the description.
Then follow n lines — for each goal the names of the teams that scored it.
The names are non-empty lines consisting of uppercase Latin letters whose lengths do not exceed 10 symbols.
It is guaranteed that the match did not end in a tie and the description contains no more than two different teams.

Output
Print the name of the winning team.
We remind you that in football the
team that scores more goals is considered the winner.

Solved
 */
public class FootBall_A {
    

    public static String getWinner(int n, String[] values){
        
        Map<String,Integer> teams = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String key =  values[i];
            if(teams.containsKey(key))
            teams.put(key, teams.get(key) + 1);

            else 
                teams.put(key, 1);
        }
        
        int max = Integer.MIN_VALUE;
        String res = "";
        for (Entry<String,Integer> tEntry : teams.entrySet()) {
            if(max < tEntry.getValue()){
                res = tEntry.getKey();
                max = tEntry.getValue();
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        
        String[] teams = new String[n];

        for (int i = 0; i < n; i++) {
            teams[i] = sc.next();
        }

        System.out.println(getWinner(n, teams));
    }
}
