package Training;

import java.util.Scanner;

public class CompoundInterestArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] p = new double[10]; // principal
        double[] r = new double[10]; // rate
        double[] y = new double[10]; // years
        double[] c = new double[10]; // compounding freq
        double[] amt = new double[10]; // amount

        for (int i = 0; i < 4; i++) {
            System.out.println("Set " + (i + 1));
            System.out.print("P: ");
            p[i] = s.nextDouble();

            System.out.print("R: ");
            r[i] = s.nextDouble();

            System.out.print("Yrs: ");
            y[i] = s.nextDouble();

            System.out.print("C/Yr: ");
            c[i] = s.nextDouble();

            amt[i] = p[i] * Math.pow((1 + r[i] / c[i]), y[i] * c[i]);
        }

        System.out.println("\nFinal Amounts:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Set " + (i + 1) + ": " + String.format("%.2f", amt[i]));
        }
    }
}
