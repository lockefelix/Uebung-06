package p1;

public class P1_main {
    public static void main(String[] args) {
        int x = 8;
        int result = squared(x);
        System.out.println(result);
    }

    public static int squared(int x) {
        x = (x + 1) * (x + 1);
        return x;
    }
}