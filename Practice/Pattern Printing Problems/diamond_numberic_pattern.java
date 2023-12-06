/*

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5

*/

/**
 * diamond_numberic_pattern
 */
public class diamond_numberic_pattern {

    public static void main(String[] args) {

        int n = 5;
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}