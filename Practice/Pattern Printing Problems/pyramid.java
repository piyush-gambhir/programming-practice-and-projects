/*

Pryamid Star Pattern 

    * 
   * * 
  * * * 
 * * * * 
* * * * *

*/

import java.util.Scanner;

/**
 * pyramid
 */
public class pyramid {

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {

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