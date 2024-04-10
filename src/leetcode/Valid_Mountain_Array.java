package leetcode;

public class Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length,
                k = 0;
        if (n < 3)
            return false;
        while (k < n-1 && arr[k] < arr[k+1]) {
            k+=1;
        }
        if (k == 0 || k == n-1)
            return false;
        for (int i = k; i < n-1; i++) {
            if (arr[i] <= arr[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 3, 4, 5, 2, 1, 0};
        System.out.println(validMountainArray(arr));
    }
}
