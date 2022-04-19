import java.util.Collections;

public class Sort_Array_By_Parity {

    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length,
        left = 0,
        right = n - 1;
//        Cach 1.
//        int[] res = new int[n];
//        for (int i = 0; i < n; i++) {
//            if (isEven(nums[i])) {
//                res[left++] = nums[i];
//            }
//            else {
//                res[right--] = nums[i];
//            }
//        }
//
//        return res;

//        Cach 2:
        while (left <= right) {
            if (!isEven(nums[left])) {
                if (isEven(nums[right])) {
                    int tmp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = tmp;
                    left++;
                    right--;
                }
                else {
                    right--;
                }

            }
            else {
                left++;
            }
        }
        return nums;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 3, 4};
        nums = sortArrayByParity(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
