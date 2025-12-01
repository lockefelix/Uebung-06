package p3;

public class P3_main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, -6, -6, -7, -3};
        System.out.println(zweitGroessterBetrag(a));
    }

    public static int zweitGroessterBetrag(int[] a) {
        int max = -1;
        int fastMax = -1;
        int k = a.length - 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (Math.abs(a[j]) > Math.abs(a[i]) && Math.abs(a[j]) > Math.abs(max)) {
                    max = a[j];
                }
                if (Math.abs(a[j]) > Math.abs(a[i]) && Math.abs(a[j]) > Math.abs(max)) {
                    fastMax = a[j];
                }
            }
        }
        return fastMax;
    }
}
