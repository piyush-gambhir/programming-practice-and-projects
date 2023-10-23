/*

Reversed Pryamid Star Pattern 

* * * * *
 * * * *
  * * * 
   * *
    * 

*/

import java.util.Scanner;

/**
 * reversed_pyramid
 */
public class reversed_pyramid {

    // public static void printPattern(int rows) {
    //     for (int i = rows; i >= 1; i--) {

    //         for (int j = 0; j <= rows - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = i; j >= 1; j--) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
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