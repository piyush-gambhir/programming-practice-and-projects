/*

Number Pattern 

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1

*/

/**
 * number_pattern_3
 */
public class number_pattern_3_descending {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}