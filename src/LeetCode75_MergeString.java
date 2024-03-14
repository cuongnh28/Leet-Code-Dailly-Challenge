public class LeetCode75_MergeString {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int m = word1.length(),
            n = word2.length(),
            i = 0;
        StringBuilder result = new StringBuilder(m + n);
        while (i < m && i < n) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }
        while (i < m) {
            result.append(word1.charAt(i));
            i++;
        }
        while (i < n) {
            result.append(word2.charAt(i));
            i++;
        }
        return result.toString();
    }

}
