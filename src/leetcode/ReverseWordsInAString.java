package leetcode;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] str = s.trim().split("\\s+");
        for (int i = str.length - 1; i > 0; i--) {
            result.append(str[i]).append(" ");
        }
        result.append(str[0]);
        return result.toString();
    }
}
