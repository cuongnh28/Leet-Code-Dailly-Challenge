import java.util.Arrays;

public class Height_Checker {
    public static int heightChecker(int[] heights) {
        int[] tmpArray = heights.clone();
        Arrays.sort(heights);
        int res = 0,
            n = heights.length;
        for (int i = 0; i < n; i++) {
            if (heights[i] != tmpArray[i])
                res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,4};
        System.out.println(heightChecker(nums));
    }
}
