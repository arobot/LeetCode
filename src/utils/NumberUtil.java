package utils;

public class NumberUtil {
    public static void swap(Integer x, Integer y) {
        if (x == y)
            return;
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("x=" + x + ";y=" + y);
    }

    public static void main(String[] args) {
        int x = 300, y = 400;
        swap(x, y);
        System.out.println("x=" + x + ";y=" + y);
    }
}
