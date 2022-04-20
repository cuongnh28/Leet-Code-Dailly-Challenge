import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
//        Cach 1
//        int[] counts = new int[nums.length];
//        int maxConsecutive = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                counts[i] = 1;
//                maxConsecutive = 1;
//            }
//        }
//        for (int i = 1; i < nums.length; i++) {
//                if (nums[i] == 1 && nums[i] == nums[i-1]) {
//                    counts[i] = counts[i-1] + 1;
//                    if (maxConsecutive < counts[i])
//                        maxConsecutive = counts[i];
//                }
//        }
//        return maxConsecutive;
        int count = 0,
                maxConsecutive = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }
            if (count > maxConsecutive)
                maxConsecutive = count;
        }
        return maxConsecutive;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
