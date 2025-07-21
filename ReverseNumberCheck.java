package Training;

import java.util.Scanner;

public class ReverseNumberCheck {
    int num;

    ReverseNumberCheck(int num) {
        this.num = num;
    }

    public void reverseAndCheck() {
        if (num < 10000 || num > 99999) {
            System.out.println("Enter 5-digit only!");
            return;
        }

        int orig = num;
        int rev = 0;

        while (num > 0) {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }

        System.out.println("Reverse: " + rev);

        if (rev == orig) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 5-digit: ");
        int n = s.nextInt();

        ReverseNumberCheck r = new ReverseNumberCheck(n);
        r.reverseAndCheck();
    }
}
