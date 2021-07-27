public class maxMultiplication {
    public static void main(String[] args) {
        int[] a = { -4, 7, -1, 18, 2, 5 };
        int n = a.length;
        // int res = maxMulti(a, n);
        int res = maxMulti2(a, n);
        System.out.println("Maximum Multiplication is : " + res);
    }

    // Maximum multiplication of any two numbers in array
    // Brute Force approach
    // Time Complexity : O(n^2)

    // private static int maxMulti(int[] a, int n) {
    // int max = 0;
    // if (n < 2)
    // return -1;
    // if (n == 2) {
    // return a[0] * a[1];
    // }
    // for (int i = 0; i < a.length; i++) {
    // for (int j = i + 1; j < a.length; j++) {
    // if (a[i] * a[j] > max) {
    // max = a[i] * a[j];
    // }
    // }
    // }
    // return max;
    // }

    // Best approach ----- by finding max and min n second max and second min and
    // multiplying them
    // Time Complexity : O(n)

    private static int maxMulti2(int[] a, int n) {
        if (n < 2)
            return -1;
        if (n == 2) {
            return a[0] * a[1];
        }
        int max = (a[0] > a[1]) ? a[0] : a[1];
        int secondMax = (a[0] < a[1]) ? a[1] : a[0];

        int min = (a[0] < a[1]) ? a[0] : a[1];
        int secondMin = (a[0] > a[1]) ? a[1] : a[0];

        for (int i = 2; i < a.length; i++) {

            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }

            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin) {
                secondMin = a[i];
            }

        }
        int mul1 = min * secondMin;
        int mul2 = max * secondMax;

        int result = (mul1 > mul2) ? mul1 : mul2;

        return result;
    }
}
