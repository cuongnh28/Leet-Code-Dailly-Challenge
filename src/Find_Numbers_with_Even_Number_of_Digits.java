public class Find_Numbers_with_Even_Number_of_Digits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenNumerOfDigits(nums[i]))
                count++;
        }
        return count;
    }

    public static boolean isEvenNumerOfDigits(int number) {
        int numberOfDigits = 0;
        while (number > 0) {
            numberOfDigits++;
            number/=10;
        }
        return numberOfDigits % 2 == 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5552, 22};
        System.out.println(findNumbers(arr));
    }
}
