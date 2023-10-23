/*

Solid Diamond Shape Star Pattern
   
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/

import java.util.Scanner;

/**
 * solid_diamond
 */
public class solid_diamond {

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
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