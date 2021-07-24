
// Binary Search works on only sorted array 
// Time complexity : O(log N)
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int a[] = { 2, 5, 7, 19, 50, 134, 267 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you wanna search");
        int x = sc.nextInt();
        int r = bSearch(a, x);
        if (r == -1)
            System.out.println(x + " Number not found");
        else
            System.out.println(x + " Number is found at : " + r);
        sc.close();
    }

    private static int bSearch(int[] a, int x) {
        int s = 0;
        int e = a.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            // int mid = s + (e-s)/2; for higher values

            if (a[mid] == x)
                return mid;

            else if (x > a[mid])
                s = mid + 1;

            else
                e = mid - 1;
        }
        return -1;
    }

}
