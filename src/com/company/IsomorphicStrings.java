package com.company;

import java.util.HashMap;

/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving
the order of characters. No two characters may map to the same character, but a character may map to itself.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> sMap = new HashMap<>();
        int sInt ;
        HashMap<Character, Integer> tMap = new HashMap<>();
        int tInt;
        for (int i = 0; i < s.length(); i++){
            if (!sMap.containsKey(s.charAt(i)))  sMap.put(s.charAt(i), i);
            sInt = sMap.get(s.charAt(i));

            if (!tMap.containsKey(t.charAt(i)))  tMap.put(t.charAt(i), i);
            tInt = tMap.get(t.charAt(i));

            if (sInt != tInt) return false;

        }
        return true;
    }
}
