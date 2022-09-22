//NAME: EUAN BOURKE
//ID: 21332142

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_1 {
    public static void main(String[] args) {

        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3x4 Matrix row by row");

        Scanner in = new Scanner(System.in);

        int i = 0;
        int j = 0;
        while (j < 3) {
            while (i < 4) {
                matrix[j][i] = in.nextDouble();
                i++;
            }
            i = 0;
            j++;
        }

        double col1 = 0;
        double col2 = 0;
        double col3 = 0;
        double col4 = 0;

        while (i < 3) {
            col1 += matrix[i][0];
            col2 += matrix[i][1];
            col3 += matrix[i][2];
            col4 += matrix[i][3];
            i++;
        }
        System.out.printf("Sum of elements in column 1 = %.1f\n", col1);
        System.out.printf("Sum of elements in column 2 = %.1f\n", col2);
        System.out.printf("Sum of elements in column 3 = %.1f\n", col3);
        System.out.printf("Sum of elements in column 4 = %.1f\n", col4);

    }
}
