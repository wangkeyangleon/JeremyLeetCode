package leetcode.algorithm;

import java.util.HashMap;

/**
 * @program: LeetCode
 * @description: 在一个字符串(0 < = 字符串长度 < = 10000 ， 全部由字母组成)中找到第一个只出现一次的字符, 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 * @author: Keyang Wang
 * @create: 2021-09-09 14:03
 **/
public class FirstNotRepeatingChar {
    public int firstNotRepeatingChar(String str){
        if(str.isEmpty()){
            return  -1;
        }

        char[] array = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : array) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        int index =-1;
        for(int i =0; i<array.length;i++){
            if(map.get(array[i]) ==1){
                index = i;
                break;
            }
        }
        return index;
    }
}
