import java.util.Scanner;

public class print_all_numbers_given_range {

	public static void main(String[] args) {
		int number = new Scanner(System.in).nextInt();

		for (int i = 2; i <= number; i++) {
			int count = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(i);
			}
		}
	}
}
