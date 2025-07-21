package Training;

public class Largest_Triangle_Area {
    public static void main(String[] args) {
        double[] a = {137.4, 155.2, 149.3, 160, 155.6, 149.7};
        double[] b = {80.9, 92.62, 97.93, 100.25, 68.95, 120};
        double[] ang = {0.78, 0.89, 1.35, 9, 1.25, 1.75};

        double[] ar = new double[6];
        double max = 0;
        int idx = -1;

        System.out.println("Plot  Area");
        for (int i = 0; i < 6; i++) {
            ar[i] = 0.5 * a[i] * b[i] * Math.sin(ang[i]);
            System.out.println((i + 1) + "     " + ar[i]);

            if (ar[i] > max) {
                max = ar[i];
                idx = i;
            }
        }

        System.out.println("\nBiggest plot: " + (idx + 1));
        System.out.println("Max area: " + max);
    }
}
