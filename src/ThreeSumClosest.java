import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1,
                    right = n - 1;
            while (left < right) {
                int tmpSum = nums[left] + nums[i] + nums[right];
                if (Math.abs(tmpSum - target) < minDiff) {
                    minDiff = Math.abs(tmpSum - target);
                    result = tmpSum;
                }
                if (tmpSum == target)
                    return target;
                else if (tmpSum > target)
                    right--;
                else
                    left++;
            }
        }
        return result;
    }
}
