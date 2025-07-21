package Training;

public class LeapYearCheck {

    public static boolean leap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static void main(String[] args) {
        int y = 2024;

        if (leap(y))
            System.out.println(y + " is Leap.");
        else
            System.out.println(y + " is Not Leap.");
    }
}
