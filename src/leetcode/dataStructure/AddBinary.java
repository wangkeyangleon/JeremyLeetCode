package leetcode.dataStructure;

import java.util.ArrayList;

/**
 * @program: LeetCode
 * @description: 67
 * <p>
 * Given two binary strings a and b, return their sum as a binary string.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * @author: Keyang Wang
 * @create: 2021-01-25 20:20
 **/
public class AddBinary {
    public String addBinary(String a, String b) {
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        //add to chars for the same length
        while (aLength >= 0 && bLength >= 0) {
            int sum = carry;
            sum = sum + a.charAt(aLength--) - '0';
            sum = sum + b.charAt(bLength--) - '0';
            carry = sum / 2;
            stringBuilder.append(sum % 2);
        }
        //if a still has some chars add the rest
        while (aLength >= 0) {
            int sum = carry + a.charAt(aLength--) - '0';
            carry = sum / 2;
            stringBuilder.append(sum % 2);
        }
        //if b still has some chars add the rest
        while (bLength >= 0) {
            int sum = carry + b.charAt(bLength--) - '0';
            carry = sum / 2;
            stringBuilder.append(sum % 2);
        }
        //if the carry not equal to 0 which means still have some chars not added yet
        if (carry == 1) {
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary(a,b));


    }
}
