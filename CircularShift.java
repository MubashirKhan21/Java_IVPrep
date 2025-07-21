package Training;

public class CircularShift {
    public static void shift(int x, int y, int z) {
        int t = x;
        x = z;
        z = y;
        y = t;
        System.out.println("After shift: x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {
        int a = 5, b = 8, c = 10;
        shift(a, b, c);
    }
}
