package leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: LeetCode
 * @description: 242
 * <p>
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 * @author: Keyang Wang
 * @create: 2021-02-24 21:17
 **/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.equals("") && t.equals("")) {
            return true;
        }
        HashMap<Character, Integer> sHash = new HashMap<>();
        for (Character ch : s.toCharArray()
        ) {
            if (sHash.containsKey(ch)) {
                int i = sHash.get(ch);
                sHash.put(ch, i + 1);
            } else {
                sHash.put(ch, 1);
            }
        }
        for (Character ch : t.toCharArray()
        ) {
            if (sHash.containsKey(ch)) {
                int i = sHash.get(ch) - 1;
                if (i < 0) {
                    return false;
                } else {
                    sHash.put(ch, i);
                }

            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sCh = s.toCharArray();
        char[] tCh = t.toCharArray();
        Arrays.sort(sCh);
        Arrays.sort(tCh);
        return Arrays.equals(sCh, tCh);
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram.isAnagram(s, t));


    }
}
