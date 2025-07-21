package Training;

import java.util.Scanner;

public class Calculator {
    int x, y;

    Calculator(int a, int b) {
        x = a;
        y = b;
    }

    void add() {
        System.out.println("Add: " + (x + y));
    }

    void sub() {
        System.out.println("Sub: " + (x - y));
    }

    void mul() {
        System.out.println("Mul: " + (x * y));
    }

    void div() {
        if (y == 0)
            System.out.println("Can't divide by 0");
        else
            System.out.println("Div: " + (x / (double) y));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Num 1: ");
        int a = s.nextInt();
        System.out.print("Num 2: ");
        int b = s.nextInt();

        Calculator c = new Calculator(a, b);

        System.out.println("1-Add  2-Sub  3-Mul  4-Div");
        System.out.print("Pick: ");
        int ch = s.nextInt();

        if (ch == 1)
            c.add();
        else if (ch == 2)
            c.sub();
        else if (ch == 3)
            c.mul();
        else if (ch == 4)
            c.div();
        else
            System.out.println("Wrong pick!");
    }
}
