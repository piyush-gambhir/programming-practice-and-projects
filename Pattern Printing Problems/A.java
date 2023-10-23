import java.util.Scanner;

/**
 * A
 */
public class A {

    public static void printA(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= (2 * height) - 1; j++) {
                if (j == height || j == (2 * height) - 1 - height
                        || (i == (height / 2) && j < height && j > (2 * height) - 1 - height)) {
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
        printA(height);
    }
}