// import java.util.Arrays;
import java.util.HashSet;

public class sumPair {
    public static void main(String[] args) {
        int a[] = { 12, 3, 5, 1, 9 };
        int x = 8; /* targeted sum */
        int n = a.length;
        ;
        boolean r = searchSumPair(a, x, n);
        if (r == false)
            System.out.println("Sum pair does not found");
        else
            System.out.println("Pair with given sum exists : " + x);
    }

    // Method 1 : Brute force ---- adding elements one by one and checking the
    // matching Sum
    // Time complexity : O(N^2)

    // private static boolean searchSumPair(int[] a, int x, int n) {
    // if (a.length == 0)
    // return false;

    // int sum = 0;
    // for (int i = 0; i < a.length - 1; i++) {
    // for (int j = i + 1; j < a.length; j++) {
    // sum = a[i] + a[j];
    // if (x == sum)
    // return true;
    // }
    // }
    // return false;
    // }

    // Method 2 : Sorting & two priority ---- taking two points as end and start
    // where we add them and check the matching sum
    // Time complexity : O(nlogn)

    // private static boolean searchSumPair(int[] a, int x, int n) {
    // if (a.length == 0)
    // return false;

    // Arrays.sort(a);
    // // a ={1,3,5,9,12}
    // int s = 0;
    // int e = a.length - 1;
    // while (s <= e) {
    // int sum = a[s] + a[e];

    // if (sum == x)
    // return true;
    // else if (sum > x)
    // e--;
    // else
    // s++;
    // }
    // return false;
    // }

    // Method:3 --- Hashing
    // Time complexity : O(N)
    // Space complexity : O(N)

    private static boolean searchSumPair(int[] a, int x, int n) {

        if (a.length == 0)
            return false;

        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < a.length; i++) {
            if (s.contains(x - a[i]))
                return true;
            else
                s.add(a[i]);

        }
        return false;
    }
}
