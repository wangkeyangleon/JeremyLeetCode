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
     *
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        //change the string to char array
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars
        ) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public String replaceSpace2(String s) {
        //check whether the string is null or empty
        if (s == null || s.isEmpty()) {
            return s;
        }
        char[] chars = s.toCharArray();
        int count = 0; //calculate number of spaces
        for (char c : chars
        ) {
            if (c == ' ') {
                count++;
            }
        }
        //define a new char to save the s
        char[] newChar = new char[chars.length + count*2];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                newChar [index++] = '%';
                newChar[index++] = '2';
                newChar[index++] ='0';
            }else {
                newChar[index++] = s.charAt(i);
            }
        }

        return new String(newChar,0,index);
    }


    public static void main(String[] args) {
        String s = "We are happy.";
        ReplaceSpace replaceSpace = new ReplaceSpace();
        System.out.println(replaceSpace.replaceSpace(s));
        System.out.println(replaceSpace.replaceSpace2(s));

    }
}
