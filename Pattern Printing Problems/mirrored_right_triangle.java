/*

Mirrored Right Triangle Star Pattern

     *
    **
   ***
  ****
 *****
******

*/

import java.util.Scanner;

/**
 * mirrored_right_triangle
 */
public class mirrored_right_triangle {

    public static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("*");
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