package online.cx.javabasic.leetcode.roman;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/12/4.
 *
 * @author 曹鑫
 */
public class RomanToInt {

    public static int romanToInt(String s){
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        int ans = 0;
        for (int i = 0; i < s.length(); ) {
            if ( i+1 < s.length() && map.containsKey(s.substring(i, i+2))) {
                ans += map.get(s.substring(i, i+2));
                i +=2;
            } else {
                ans += map.get(s.substring(i, i+1));
                i +=1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(RomanToInt.romanToInt("III"));
    }
}
