public class Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE,
            second = Integer.MIN_VALUE,
            third = Integer.MIN_VALUE,
            n = nums.length;
        boolean isHaveIntValueElement = false;
        for (int i = 0; i < n; i++) {
            int element = nums[i];
            if (element == Integer.MIN_VALUE) {
                isHaveIntValueElement = true;
                continue;
            }
            if (element > max) {
                third = second;
                second = max;
                max = element;
            }
            else if (element > second && element != max) {
                third = second;
                second = element;
            }
            else if (element >= third && element < second ) {
                third = element;
            }
        }
        if (third == Integer.MIN_VALUE) {
            if (isHaveIntValueElement && second != Integer.MIN_VALUE) {
                return third;
            }
            else
                return max;
        }
        return third;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-2147483648, -2147483648, 2};
        System.out.println(thirdMax(nums));
    }
}
