package leetcode.dataStructure;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @program: LeetCode
 * @description: 1021
 * <p>
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 * <p>
 * A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
 * <p>
 * Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 * <p>
 * Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
 * <p>
 * Example 1:
 * <p>
 * Input: "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 * Example 2:
 * <p>
 * Input: "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation:
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
 * Example 3:
 * <p>
 * Input: "()()"
 * Output: ""
 * Explanation:
 * The input string is "()()", with primitive decomposition "()" + "()".
 * After removing outer parentheses of each part, this is "" + "" = "".
 * @author: Keyang Wang
 * @create: 2021-01-09 22:10
 **/
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        int a = 0;
        for (char c:S.toCharArray()
             ) {
            if (c==')')
                a-=1;
            if (a>=1)
                stringBuilder.append(c);
            if (c=='(')
                a+=1;
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();
        System.out.println(removeOutermostParentheses.removeOuterParentheses("(()())(())"));
    }

}
