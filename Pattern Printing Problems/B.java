import java.util.Scanner;

/**
 * A
 */
public class B {

    public static void printB(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= (2 * height) - 1; j++) {
                if () {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of The Character: ");
        int height = sc.nextInt();
        sc.close();
        printB(height);
    }
}