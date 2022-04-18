public class Move_Zeroes {
    public static int[] moveZeroes(int[] nums) {
        int n = nums.length,
        currentIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[currentIndex++] = nums[i];
            }
        }
        for (int i = currentIndex; i < n; i++) {
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 2};
        arr = moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
