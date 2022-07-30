package com.company;
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting
some (can be none) of the characters without disturbing the relative positions of the remaining characters.
 (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int lastJ = 0;
        int i = 0;
        int num = 0;
        int sl = s.length();
        if (sl > t.length()) return false;
        for (;i < sl; i++){
            char sc =s.charAt(i);
            for (int j = lastJ; j < t.length(); j++){
                char tc = t.charAt(j);
                if (sc == tc){
                    lastJ = j+1;
                    num ++;
                    break;
                }else if (j == t.length()-1) return false;

            }
        }
        return num == sl;
    }
}
