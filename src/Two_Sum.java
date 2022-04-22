import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                res[0] = numsMap.get(target - nums[i]);
                res[1] = i;
                break;
            }
            else {
                numsMap.put(nums[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int k = 6;
        int[] res = twoSum(nums, k);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
    }
}
