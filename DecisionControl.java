package Training;

import java.util.Scanner;

public class DecisionControl {

    char ch;

    DecisionControl(char c) {
        ch = c;
    }

    void isLower() {
        if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is lowercase.");
        else
            System.out.println(ch + " is not lowercase.");
    }

    void isSpecial() {
        if (!Character.isLetterOrDigit(ch))
            System.out.println(ch + " is special.");
        else
            System.out.println(ch + " is not special.");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Char: ");
        char x = s.next().charAt(0);

        DecisionControl d = new DecisionControl(x);

        System.out.println("1. Lower?");
        System.out.println("2. Special?");
        System.out.print("Pick (1/2): ");
        int opt = s.nextInt();

        if (opt == 1)
            d.isLower();
        else if (opt == 2)
            d.isSpecial();
        else
            System.out.println("Wrong pick!");
    }
}
