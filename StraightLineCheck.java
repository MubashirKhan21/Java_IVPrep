package Training;

import java.util.Scanner;

public class StraightLineCheck {
    int x1, y1, x2, y2, x3, y3;

    StraightLineCheck(int a, int b, int c, int d, int e, int f) {
        x1 = a; y1 = b;
        x2 = c; y2 = d;
        x3 = e; y3 = f;
    }

    void check() {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        if (area == 0)
            System.out.println("Points lie on a straight line.");
        else
            System.out.println("Points do NOT lie on a straight line.");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("x1 y1: ");
        int a = s.nextInt(), b = s.nextInt();
        System.out.print("x2 y2: ");
        int c = s.nextInt(), d = s.nextInt();
        System.out.print("x3 y3: ");
        int e = s.nextInt(), f = s.nextInt();

        StraightLineCheck obj = new StraightLineCheck(a, b, c, d, e, f);
        obj.check();
    }
}
