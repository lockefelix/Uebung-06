package h1;

public class H1_main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(isMirrorArray(a, b));
    }

    public static boolean isMirrorArray(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i <= a.length - 1; i++) {
                if (a[i] != b[b.length - i - 1]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
