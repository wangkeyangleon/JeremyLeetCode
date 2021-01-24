package leetcode.dataStructure;

/**
 * @program: LeetCode
 * @description: 28
 * <p>
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string.
 * This is consistent to C's strstr() and Java's indexOf().
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Example 3:
 * <p>
 * Input: haystack = "", needle = ""
 * Output: 0
 * @author: Keyang Wang
 * @create: 2021-01-19 23:27
 **/
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (haystack.equals(needle)){
            return 0;
        }
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();

        for (int i = 0; i < haystackChar.length; i++) {
            int j = 0;
            if (haystackChar[i] == needleChar[0]) {
                int temp = i;
                while (j < needleChar.length && haystackChar[temp] == needleChar[j]) {
                    j++;
                    temp++;
                    if (temp==haystackChar.length){
                        temp = i;
                    }
                }
                if (j == needleChar.length) {
                    return i;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        ImplementstrStr implementstrStr = new ImplementstrStr();
        String haystack = "mississippi";
       String needle = "issipi";
//        String haystack = "abc";
//        String needle = "c";
        System.out.println(implementstrStr.strStr(haystack, needle));
    }
}
