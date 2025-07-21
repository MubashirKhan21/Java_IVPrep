package Training;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 5-digit: ");
        int n = s.nextInt();

        if (n < 10000 || n > 99999) {
            System.out.println("Invalid! Try 5-digit.");
            return;
        }

        int r = 0;
        while (n > 0) {
            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }

        System.out.println("Rev: " + r);
    }
}
