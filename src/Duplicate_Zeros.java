public class Duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {
        int k = 0,
            i = 0,
            n = arr.length;
        int[] result = new int[n+1];
        while (k < n) {
            if (arr[i] == 0) {
                result[k++] = 0;
                result[k++] = 0;
            }
            else {
                result[k++] = arr[i];
            }
            i++;
        }
        for (int j = 0; j < n; j++) {
            arr[j] = result[j];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0};
        duplicateZeros(arr);
    }
}
