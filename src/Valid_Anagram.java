import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < n; i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) == 0)
                    return false;
                map.put(c, map.get(c) - 1);
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        "anagram"
//        "nagaram"
//        a 3
//        n
//        g
//        r
//        m

        String s = "nagaram", t = "anagrax";
        System.out.println(isAnagram(s, t));
    }
}
