package h3;

public class H3_main {
    public static void main(String[] args) {
        int[] a = {2, 3, 5};
        int[] b = {2, 5, 3};

        System.out.println(compareArraysVal(a, b));
    }

    public static boolean compareArraysVal(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            int value = 0;
            int countA = 0;
            int countB = 0;

            for (int j = 0; j < a.length + 1; j++) {
                if (a[j] == value) {
                    countA++;
                }
            }

            for (int j = 0; j < b.length + 1; j++) {
                if (b[j] == value) {
                    countB++;
                }
            }

            if (countA != countB) {
                return false;
            }
        }
        return true;
    }
}
