public class Greatest_Element_on_Right_Side {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length,
        max = Integer.MIN_VALUE;
        int[] res = new int[n];
        res[n-1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, arr[i+1]);
            res[i] = max;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{400, -3, -2, -4, -6, -5};
        arr = replaceElements(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
