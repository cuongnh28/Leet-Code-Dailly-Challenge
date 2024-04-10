package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (setNums.contains(nums[i]))
                return true;
            setNums.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-100,3,99,-1}; //-> n = 4, k = 2
        System.out.println(containsDuplicate(nums));
    }
}
