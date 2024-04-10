package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        int res = -1;
        Map<Character, Integer> mainMap = new LinkedHashMap<>();
        Map<Character, Integer> duplicateMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mainMap.containsKey(s.charAt(i))) {
                mainMap.remove(s.charAt(i));
                duplicateMap.put(s.charAt(i), i);
            }
            else {
                if (!duplicateMap.containsKey(s.charAt(i)))
                        mainMap.put(s.charAt(i), i);
            }
        }
        if (!mainMap.isEmpty())
            res = (Integer) mainMap.values().toArray()[0];
        return res;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(firstUniqChar(str));
    }
}
