public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}
        };
        double sum = 0;
        sum = matrix[0][2] + matrix[1][2] + matrix[2][2];
        System.out.println(sum / 3);
    }
}
