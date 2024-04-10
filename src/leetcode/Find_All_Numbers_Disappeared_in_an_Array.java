package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int[] checkExistArr = new int[n]; //if checkExistArr[nums[i]] == 0 -> add to result.
        for (int i = 0; i < n; i++) {
            checkExistArr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int p = nums[i];
            if (p != 0) {
                checkExistArr[p-1] = p;
            }
        }

        for (int i = 0; i < n; i++) {
            if (checkExistArr[i] == 0)
                result.add(i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1};
        List<Integer> res = findDisappearedNumbers(nums);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
        }
    }
}
