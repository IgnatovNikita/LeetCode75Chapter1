package com.company;

import java.util.LinkedList;
import java.util.List;

/*Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#'
means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        LinkedList<Character> sL = new LinkedList<>();
        LinkedList<Character> tL = new LinkedList<>();

        for (Character ch: s.toCharArray()) {
         if (ch == '#' && sL.size() == 0){}
         else if (ch == '#') sL.removeLast();
         else sL.add(ch);
        }

        for (Character ch: t.toCharArray()) {
            if (ch == '#' && tL.size() == 0){}
            else if (ch == '#') tL.removeLast();
            else tL.add(ch);
        }

        return  sL.equals(tL);
    }
}
