package Training;

import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("KM: ");
        double km = s.nextDouble();

        double m = km * 1000;
        double f = km * 3280.84;
        double i = km * 39370.1;
        double cm = km * 100000;

        System.out.println("M: " + m);
        System.out.println("Ft: " + f);
        System.out.println("Inch: " + i);
        System.out.println("CM: " + cm);
    }
}
