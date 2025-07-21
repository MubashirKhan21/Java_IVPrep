package Training;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Num: ");
        int n = s.nextInt();
        long f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println("Fact of " + n + " = " + f);
    }
}
