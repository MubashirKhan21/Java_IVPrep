package Training;

public class CoordinateGeometry {

    public static double dist(double a, double b, double c, double d) {
        return Math.sqrt((b - a) * (b - a) + (d - c) * (d - c));
    }

    public static double triArea(double a, double b, double c,
                                 double d, double e, double f) {
        return Math.abs((a * (e - f) + b * (f - d) + c * (d - e)) / 2.0);
    }

    public static int inTri(double a, double b, double c,
                            double d, double e, double f,
                            double x, double y) {
        double A = triArea(a, b, c, d, e, f);
        double A1 = triArea(x, b, c, y, e, f);
        double A2 = triArea(a, x, c, d, y, f);
        double A3 = triArea(a, b, x, d, e, y);

        return (A == A1 + A2 + A3) ? 1 : 0;
    }

    public static void main(String[] args) {
        double x1 = 0, y1 = 0;
        double x2 = 5, y2 = 0;
        double x3 = 0, y3 = 5;
        double px = 2, py = 2;

        System.out.println("Dist AB: " + dist(x1, x2, y1, y2));
        System.out.println("Area ABC: " + triArea(x1, x2, x3, y1, y2, y3));
        System.out.println("Inside? " + (inTri(x1, x2, x3, y1, y2, y3, px, py) == 1 ? "Yes" : "No"));
    }
}
