import java.util.HashSet;
import java.util.Set;

public class Single_Number {
    public static int singleNumber(int[] nums) {
        int res  = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,1,3}; //-> n = 4, k = 2
        System.out.println(singleNumber(nums));
    }
}
