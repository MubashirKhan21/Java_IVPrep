package Training;

import java.util.Scanner;

public class SteelGrade {
    float h, c;
    int t;

    SteelGrade(float h, float c, int t) {
        this.h = h;
        this.c = c;
        this.t = t;
    }

    public void checkGrade() {
        boolean a = h > 50;
        boolean b = c < 0.7;
        boolean d = t > 5600;

        if (a && b && d)
            System.out.println("Grade: 10");
        else if (a && b)
            System.out.println("Grade: 9");
        else if (b && d)
            System.out.println("Grade: 8");
        else if (a && d)
            System.out.println("Grade: 7");
        else if (a || b || d)
            System.out.println("Grade: 6");
        else
            System.out.println("Grade: 5");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Hardness: ");
        float x = s.nextFloat();
        System.out.print("Carbon: ");
        float y = s.nextFloat();
        System.out.print("Tensile: ");
        int z = s.nextInt();

        SteelGrade g = new SteelGrade(x, y, z);
        g.checkGrade();
    }
}
