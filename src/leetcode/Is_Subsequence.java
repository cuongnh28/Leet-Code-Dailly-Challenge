package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Is_Subsequence {

    public static void main(String[] args) {
        String s = "aba", t = "ahbgdcx";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length())
            return false;
        if (s.length() == t.length())
            return s.equals(t);
        int i = 0;
        int j = 0;
        int m = s.length();
        int n = t.length();
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == m;
    }
}
