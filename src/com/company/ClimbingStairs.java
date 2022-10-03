package com.company;
/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        int[] st = new int[n+1];
        st[1] = 1;
        st[2] = 2;
        st[3] = 3;
        for (int i = 4; i <=n; i++ ){
            st[i] = st[i-1] + st[i-2];
        }
        return st[n];
    }
}
