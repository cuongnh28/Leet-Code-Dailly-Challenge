package leetcode;

import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
//        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
//        char[] chars = {'a'};
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            stringBuilder.append(chars[i]);
            int j = i + 1;
            int num = 0;
            while (j < chars.length && chars[j] == chars[i]) {
                num += 1;
                j++;
                i++;
            }
            if (num > 0) {
                stringBuilder.append(num + 1);
            }
            i++;
        }
        for (int k = 0; k < stringBuilder.length(); k++) {
            chars[k] = stringBuilder.charAt(k);
        }
        return stringBuilder.length();
    }

}
