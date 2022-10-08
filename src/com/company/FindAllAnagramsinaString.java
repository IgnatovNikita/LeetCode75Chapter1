package com.company;

import java.util.ArrayList;
import java.util.List;

/*Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


 */
public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean flag = true;
        int[] pInt = new int[26];
        for (int i = 0; i < p.length(); i++){
            pInt[p.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < s.length(); i++){
            if (s.length() < p.length() + i) break;

            int[] hash = pInt.clone();
            flag = true;

            for (int j = 0; j < p.length(); j++){

                int i1 = s.charAt(i + j) - 'a';
                if (hash[i1] > 0){
                    hash[i1] --;
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag) res.add(i);
        }


        return res;
    }
}
