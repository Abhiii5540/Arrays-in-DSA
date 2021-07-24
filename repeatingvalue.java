import java.util.HashSet;

public class repeatingvalue {
    public static void main(String[] args) {
        int a[] = { 10, 5, 3, 4, 4, 3, 5, 6 };
        int f = firstrepeat(a);
        System.out.println("First Repeating element is : " + f);
    }

    // Method 1 : Brute force
    // Time complexity : O(N^2)

    // private static int firstrepeat(int[] a) {
    //     int c = 1;
    //     for (int i = 0; i < a.length - 1; i++) {
    //         for (int j = i + 1; j < a.length; j++) {
    //             if (a[i] == a[j]) {
    //                 c = c + 1;
    //             }
    //         }
    //         if (c > 1) {
    //             return a[i];
    //         }
    //     }
    //     return 0;
    // }

    // Method:3 --- Hashing
    // Time complexity : O(N)
    // Space complexity : O(N)

    private static int firstrepeat(int[] a) {
        int firstrepeat = -1;

        HashSet<Integer> set = new HashSet<>();

        for (int i=a.length-1; i>=0; i--)
        {
            if (set.contains(a[i]))
               firstrepeat=a[i];
 
            else 
                set.add(a[i]);
        }
        return firstrepeat;
    }
}
