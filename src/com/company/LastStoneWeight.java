package com.company;

import java.util.ArrayList;

import java.util.Collections;


/*You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left, return 0.

 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> st = new ArrayList<>(stones.length);
        for (int i: stones) {st.add(i);}

        while (st.size() >= 2){
            int x = Collections.max(st);
            st.remove((Object)x);
            int y = Collections.max(st);
            st.remove((Object)y);

            if (x != y){
                st.add(x - y);
            }


        }
        if (st.size() == 1) return st.get(0);
        else return 0;

    }
}
