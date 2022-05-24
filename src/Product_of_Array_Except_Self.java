public class Product_of_Array_Except_Self {

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int productExcludeZero = 1;
        int numsOfZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numsOfZero++;
            }
            else {
                productExcludeZero *= nums[i];
            }
        }

        if (numsOfZero >= 2) {
            for (int i = 0; i < nums.length; i++) {
                res[i] = 0;
            }
        }

        else if (numsOfZero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    res[i] = productExcludeZero;
                }
                else {
                    res[i] = 0;
                }
            }
        }

        else {
            for (int i = 0; i < nums.length; i++) {
                res[i] = productExcludeZero / nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
