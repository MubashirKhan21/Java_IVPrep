package Training;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter basic: ");
        double b = s.nextDouble();

        double d = 0.40 * b;
        double h = 0.20 * b;
        double g = b + d + h;

        System.out.println("Gross = " + g);
    }
}
