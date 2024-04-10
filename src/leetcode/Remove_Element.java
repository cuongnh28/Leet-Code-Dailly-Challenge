package leetcode;

public class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int currentIndex = 0,
            n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[currentIndex++] = nums[i];
            }
        }
        return currentIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int res = removeElement(nums, val);
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i]);
        }
    }
}
