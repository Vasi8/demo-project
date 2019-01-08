public class Matrix3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };
        double sum1 = matrix[0][0] + matrix[1][0] + matrix[2][0] + matrix[3][0] + matrix[4][0] + matrix[5][0];
        double sum2 = matrix[0][2] + matrix[1][2] + matrix[2][2] + matrix[3][2] + matrix[4][2] + matrix[5][2];
        double sum3 = matrix[0][4] + matrix[1][4] + matrix[2][4] + matrix[3][4] + matrix[4][4] + matrix[5][4];
        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);

    }
}
