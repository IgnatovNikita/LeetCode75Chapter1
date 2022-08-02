package com.company;


import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> map = new HashSet<>();
        int res = 0;
        char c;
        for (int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if (map.contains(c)) {
                res += 2;
                map.remove(c);
            }
            else map.add(c);

        }
        if (!map.isEmpty()) res ++;
        return res;
    }
}
