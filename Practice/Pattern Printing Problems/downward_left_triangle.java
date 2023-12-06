/*

Downward Left Triangle Star Pattern

* * * * * 
  * * * *   
    * * * 
      * * 
        * 

*/

import java.util.Scanner;

/**
 * downward_left_triangle
 */
public class downward_left_triangle {

    public static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--) {

            for (int j = 0; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
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
