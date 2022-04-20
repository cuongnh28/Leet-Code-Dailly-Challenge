import java.lang.reflect.Array;
import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
//        Cach 1.
//        int[] squaredNumbers = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            squaredNumbers[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(squaredNumbers);

//        Cach 2: merge function
//        int pivot = findPivot(nums),
//            n = nums.length,
//            left = pivot + 1,
//            right = n - left,
//            l = pivot,
//            r = left,
//            k = 0;
//        int[] squaredNumbers = new int[n];
//        while (left != 0 && right != 0) {
//            if (Math.abs(nums[l]) < Math.abs(nums[r])) {
//                squaredNumbers[k++] = nums[l] * nums[l];
//                l--;
//                left--;
//            }
//            else {
//                squaredNumbers[k++] = nums[r] * nums[r];
//                r++;
//                right--;
//            }
//        }
//        for (int m = l; m >= 0; m--) {
//            squaredNumbers[k++] = nums[m] * nums[m];
//        }
//
//        for (int m = r; m < n; m++) {
//            squaredNumbers[k++] = nums[m] * nums[m];
//        }
//        return squaredNumbers;

//        Cach 3.
        int n = nums.length,
            left = 0,
            right = n - 1;
        int[] result = new int[n];
        for (int i = n-1; i >= 0; i--) {
            if (Math.abs(nums[right]) >= Math.abs(nums[left])) {
                result[i] = nums[right] * nums[right];
                right--;
            }
            else {
                result[i] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }

    public static int findPivot (int[] nums) {
        int pivot = -1;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] <= 0)
                pivot++;
            else
                break;
        }
        return pivot;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-3, -2, 0, 2, 4, 6};
        int[] result = sortedSquares(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
