package leetcode;

public class Remove_Duplicates_from_Sorted_Array {
    public static int removeElement(int[] nums) {
        int currentIndex = 1,
            n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i-1]) {
                nums[currentIndex++] = nums[i];
            }
        }
        return currentIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        int res = removeElement(nums);
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i]);
        }
    }
}
