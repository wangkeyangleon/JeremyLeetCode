package leetcode.dataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: LeetCode
 * @description: 20
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 *
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: s = "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: s = "{[]}"
 * Output: true
 * @author: Keyang Wang
 * @create: 2021-01-15 20:06
 **/
public class ValidParentheses {
    Map<Character,Character> map;

    public ValidParentheses() {
        map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                char top;
                if (stack.isEmpty()){
                    top = '!';
                }else {
                    top = stack.pop();
                }
                if (top != map.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()[]{}"));
    }
}

