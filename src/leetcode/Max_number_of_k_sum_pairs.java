package leetcode;

import java.util.*;

public class Max_number_of_k_sum_pairs {
    public static void main(String[] args) {
//        int[] nums = {2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2};
//        int k = 3;
//        int[] nums = {1,2,3,4};
//        int k = 5;
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
//        int[] nums = {
//                63, 10, 28, 31, 90, 53, 75, 77, 72, 47, 45, 6, 49, 13, 77, 61, 68, 43, 33, 1, 14, 62, 55, 55, 38,
//                54, 8, 79, 89, 14, 50, 68, 85, 12, 42, 57, 4, 67, 75, 6, 71, 8, 61, 26, 11, 20, 22, 3, 70, 52, 82,
//                70, 67, 18, 66, 79, 84, 51, 78, 23, 19, 84, 46, 61, 63, 73, 80, 61, 15, 12, 58, 3, 21, 66, 42, 55,
//                7, 58, 85, 60, 23, 69, 41, 61, 35, 64, 58, 84, 61, 77, 45, 14, 1, 38, 4, 8, 42, 16, 79, 60, 80, 39,
//                67, 10, 24, 15, 6, 37, 68, 76, 30, 53, 63, 87, 11, 71, 86, 82, 77, 76, 37, 21, 85, 7, 75, 83, 80, 8,
//                19, 25, 11, 10, 41, 66, 70, 14, 23, 74, 33, 76, 35, 89, 68, 85, 83, 57, 6, 72, 34, 21, 57, 72, 79,
//                29, 65, 3, 67, 8, 24, 24, 18, 26, 27, 68, 78, 64, 57, 55, 68, 28, 9, 11, 38, 45, 61, 37, 81, 89, 38,
//                43, 45, 26, 84, 62, 22, 37, 51, 15, 30, 67, 75, 24, 66, 40, 81, 74, 48, 43, 78, 14, 33, 19, 73, 5, 1,
//                2, 53, 29, 49, 73, 23, 5}
//        ;
//        int k = 59;
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        int res = 0;
        nums = Arrays.stream(nums).sorted().toArray();
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                res++;
                i++;
                j--;
            }
            else if (nums[i] + nums[j] > k) {
                j--;
            }
            else {
                i++;
            }
        }
        return res;
    }

//    Cach 1.
//    public static int maxOperations(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int res = 0;
//
//        for (int num : nums) {
//            int comp = k - num;
//            if (map.containsKey(comp)) {
//                res++;
//                if (map.get(comp) == 1) {
//                    map.remove(comp);
//                } else {
//                    map.put(comp, map.get(comp) - 1);
//                }
//            } else {
//                map.put(num, map.getOrDefault(num, 0) + 1);
//            }
//        }
//        return res;
//    }
}
