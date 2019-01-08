public class Mtrix2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };
        double sum1 = matrix[0][0] + matrix[0][1] + matrix[0][2] + matrix[0][3];
        double sum2 = matrix[1][0] + matrix[1][1] + matrix[1][2] + matrix[1][3];
        double sum3 = matrix[2][0] + matrix[2][1] + matrix[2][2] + matrix[2][3];
        double sum4 = matrix[3][0] + matrix[3][1] + matrix[3][2] + matrix[3][3];
        double sum5 = matrix[0][0] + matrix[1][0] + matrix[2][0] + matrix[3][0];
        double sum6 = matrix[0][1] + matrix[1][1] + matrix[2][1] + matrix[3][1];
        double sum7 = matrix[0][2] + matrix[1][2] + matrix[2][2] + matrix[3][2];
        double sum8 = matrix[0][3] + matrix[1][3] + matrix[2][3] + matrix[3][3];
        double sum9 = matrix[0][0] + matrix[1][1] + matrix[2][2] + matrix[3][3];
        double sum10 = matrix[3][0] + matrix[2][1] + matrix[1][2] + matrix[0][3];
        if (((sum1 == sum2) == (sum3 == sum4)) == (((sum5 == sum6) == (sum7 == sum8)) == (sum9 == sum10))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
