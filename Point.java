package Training;

public class Point {
    double x, y;

    Point(double a, double b) {
        x = a;
        y = b;
    }

    static double dist(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    static double triArea(Point[] p) {
        double a = dist(p[0], p[1]);
        double b = dist(p[1], p[2]);
        double c = dist(p[2], p[0]);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    static int inside(Point a, Point b, Point c, Point p) {
        double t = triArea(new Point[]{a, b, c});
        double a1 = triArea(new Point[]{p, b, c});
        double a2 = triArea(new Point[]{a, p, c});
        double a3 = triArea(new Point[]{a, b, p});

        return (Math.abs(t - (a1 + a2 + a3)) < 0.000001) ? 1 : 0;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        Point c = new Point(0, 5);
        Point p = new Point(1, 1);

        System.out.println("AB: " + dist(a, b));
        System.out.println("Area: " + triArea(new Point[]{a, b, c}));
        System.out.println("Inside? " + (inside(a, b, c, p) == 1 ? "Yes" : "No"));

        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(4, 5, 6);
        System.out.println("3D Dist: " + p1.dist3D(p2));
    }
}

class Point3D extends Point {
    double z;

    Point3D(double a, double b, double c) {
        super(a, b);
        z = c;
    }

    double dist3D(Point3D p) {
        return Math.sqrt((x - p.x) * (x - p.x) +
                         (y - p.y) * (y - p.y) +
                         (z - p.z) * (z - p.z));
    }
}
