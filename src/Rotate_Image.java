public class Rotate_Image {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
//        Cach 1: dung them mang temp
//        int[][] tempMatrix = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                tempMatrix[i][j] = matrix[i][j];
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = tempMatrix[n-j-1][i];
//            }
//        }

//        Cach 2:
//        B1: swap matrix[i][j] vs matrix[j][i]
        for (int i = 0; i < n; i++) {
            int tmp;
            for (int j = i; j < n; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

//        B2: swap theo chieu ngang. matrix[i][j] vs matrix[i][n-1-j]
        for (int i = 0; i < n; i++) {
            int tmp;
            for (int j = 0; j < n/2; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
