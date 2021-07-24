package leetcode.dataStructure;

/**
 * @program: LeetCode
 * @description: 剑指offer05
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * @author: Keyang Wang
 * @create: 2021-07-24 15:44
 **/
public class ReplaceSpace {

    /**
     * brute force
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        if (s == null || s.isEmpty()){
            return s;
        }
        //change the string to char array
        char[] c = s.toCharArray();
        for (char c1: c) {
            if (c1 == ' '){
                
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        ReplaceSpace replaceSpace = new ReplaceSpace();

    }
}
