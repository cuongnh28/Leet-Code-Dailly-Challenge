package leetcode;

public class Reverse_String {
    public static void reverseString(char[] s) {
        int l = 0,
            r = s.length - 1;
        while (l < r) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        char[] str = new char[]{'h','e','l','l','o'};
        reverseString(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
