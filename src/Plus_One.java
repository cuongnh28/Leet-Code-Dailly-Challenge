import java.util.ArrayList;
import java.util.List;

public class Plus_One {

    public static int[] plusOne(int[] digits) {
        List<Integer> plusOneDigits = new ArrayList<>();
        int n = digits.length,
            tempAdd = 0,
            k = 0;
        if (digits[n-1] == 9) {
            tempAdd = 1;
            plusOneDigits.add(0);
        }
        else {
            plusOneDigits.add(digits[n-1] + 1);
        }
        for (int i = n - 2; i >= 0; i--) {
            int tmp = digits[i] + tempAdd;
            if (tmp == 10) {
                plusOneDigits.add(0);
                tempAdd = 1;
            }
            else {
                plusOneDigits.add(tmp);
                tempAdd = 0;
            }
        }

        if (plusOneDigits.get(plusOneDigits.size() - 1) == 0)
            plusOneDigits.add(1);

        int[] res = new int[plusOneDigits.size()];
        for (int i = plusOneDigits.size() - 1; i >= 0; i--) {
            res[k++] = plusOneDigits.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3};
        int[] res = plusOne(nums1);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
    }
}
