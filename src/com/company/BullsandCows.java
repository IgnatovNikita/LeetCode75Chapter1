package com.company;

import java.util.HashMap;

/*
You are playing the Bulls and Cows game with your friend.

You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:

The number of "bulls", which are digits in the guess that are in the correct position.
The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.

The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.
 */
public class BullsandCows {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> secA = new HashMap<>();
        HashMap<Character, Integer> gueA = new HashMap<>();
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < secret.length(); i++){
            if (secret.charAt(i) == guess.charAt(i)) bulls ++;
            else {
                if (secA.containsKey(secret.charAt(i))) secA.put(secret.charAt(i), secA.get(secret.charAt(i)) + 1);
                else secA.put(secret.charAt(i), 1);

                if (gueA.containsKey(guess.charAt(i))) gueA.put(guess.charAt(i), gueA.get(guess.charAt(i)) + 1);
                else gueA.put(guess.charAt(i), 1);

            }
        }

        for (Character ch: secA.keySet()) {
            if (gueA.containsKey(ch)) cows += Math.min(secA.get(ch), gueA.get(ch));
        }

        return bulls + "A" + cows + "B";


    }
}
