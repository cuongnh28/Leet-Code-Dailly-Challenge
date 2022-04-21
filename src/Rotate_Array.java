public class Rotate_Array {
    public static void rotate(int[] nums, int k) {
        int n = nums.length,
            tempPosition = 0;
        int[] rotateNums = new int[n];
        k = n - k % n;
        for (int i = k; i < n; i++) {
            rotateNums[tempPosition++] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            rotateNums[tempPosition++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = rotateNums[i];
        }

//        Cach 2:
//       B1: reverse array.
//       B2: reverse array from 0 -> k.
//       B3: reverse array from k + 1 -> n - 1.

    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-100,3,99,2}; //-> n = 4, k = 2
        int k = 2;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
