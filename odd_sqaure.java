
import java.util.Scanner;

public class odd_sqaure {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int odd = 1;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            odd = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(odd);
                odd += 2;
                if (odd > 2 * n - 1) {
                    odd = 1;
                }
            }
            System.out.println();
        }
    }
}