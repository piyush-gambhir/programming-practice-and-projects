
/*

Upward Hollow Triange Star Pattern

    *
   * *
  *   *
 *     *
*********
 
*/
import java.util.Scanner;

/**
 * upward_hollow_triangle
 */
public class upward_hollow_triangle {

    public static void printPattern(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = i; j <= 2 * rows; i++) {
                System.out.println(" ");
            }

            for (int j = 1; j <= i; i++) {
                System.out.println("*");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int rows = sc.nextInt();

        printPattern(rows);

    }
}