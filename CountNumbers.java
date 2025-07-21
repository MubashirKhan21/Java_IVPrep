package Training;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = 0, n = 0, z = 0;
        char ch;

        do {
            System.out.print("Num: ");
            int x = s.nextInt();

            if (x > 0)
                p++;
            else if (x < 0)
                n++;
            else
                z++;

            System.out.print("More? (y/n): ");
            ch = s.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        System.out.println("Pos: " + p);
        System.out.println("Neg: " + n);
        System.out.println("Zero: " + z);
    }
}
