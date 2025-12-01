package p2;

public class P2_main {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4, 5, 6, 7};
        boolean result = pairwiseDifferent(someNumbers);
        System.out.println(result);
    }

    public static boolean pairwiseDifferent(int[] someNumbers) {
        for (int i = 0; i <= someNumbers.length - 1; i++) {
            for (int j = i + 1; j <= someNumbers.length - 1; j++) {
                if (someNumbers[i] == someNumbers[j]) {
                return false;
                }
            }
        }
        return true;
    }
}
