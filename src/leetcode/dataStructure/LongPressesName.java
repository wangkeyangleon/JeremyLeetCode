package leetcode.dataStructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 925
 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c,
 * the key might get long pressed, and the character will be typed 1 or more times.
 * <p>
 * You examine the typed characters of the keyboard.
 * Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
 * <p>
 * Example 1:
 * <p>
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 * Explanation: 'a' and 'e' in 'alex' were long pressed.
 * Example 2:
 * <p>
 * Input: name = "saeed", typed = "ssaaedd"
 * Output: false
 * Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
 * Example 3:
 * <p>
 * Input: name = "leelee", typed = "lleeelee"
 * Output: true
 * Example 4:
 * <p>
 * Input: name = "laiden", typed = "laiden"
 * Output: true
 * Explanation: It's not necessary to long press any character.
 * @author: Keyang Wang
 * @create: 2021-01-18 20:26
 **/
public class LongPressesName {
    public boolean isLongPressedName(String name, String typed) {
        //use two index
        int i = 0;
        int j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
