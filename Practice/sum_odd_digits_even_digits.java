import java.util.Scanner;

public class sum_odd_digits_even_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        int oddSum = 0;
        int evenSum = 0;
        while (n > 0) {
            digit = n % 10;
            n /= 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        System.out.println(evenSum + " " + oddSum);
    }
}
