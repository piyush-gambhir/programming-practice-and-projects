/*

Downward Right Triangle Star Pattern

* * * * * 
* * * * 
* * * 
* * 
* 

*/

import java.util.Scanner;

/**
 * downward_right_triangle
 */
public class downward_right_triangle {

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j >= i; j--) {
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
