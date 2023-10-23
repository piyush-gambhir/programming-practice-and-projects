/*

Binaary Number Numeric Pattern

10101
01010
10101
01010
10101

*/

import java.util.Scanner;

/**
 * binary_number_pattern
 */
public class binary_number_pattern {

    // Easy Method

    // public static void printPattern(int rows) {

    // for (int i = 1; i <= rows; i++) {
    // if (i % 2 != 0) {
    // System.out.print("10101");
    // } else {
    // System.out.print("01010");
    // }
    // System.out.println();
    // }
    // }

    public static void printPattern(int rows) {

        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("10");
                }
            } else {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("01");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int rows = sc.nextInt();

        printPattern(rows);

    }
}