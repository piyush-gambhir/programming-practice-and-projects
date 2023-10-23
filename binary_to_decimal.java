import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_number = sc.nextInt();
        int decimal_number = 0;
        int i = 0;
        while (binary_number > 0) {
            int digit = binary_number % 10;
            decimal_number += digit * (int) Math.pow(2, i);
            binary_number = binary_number / 10;
            i++;
        }
        System.out.println(decimal_number);

    }
}