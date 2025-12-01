package h2;

public class H2_main {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 7, 45, 3, 234, 23};
        int[] b = {2, 3, 5, 7, 45, 3, 234, 232};
        System.out.println(compareArrays(a, b));
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i <= a.length - 1; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
