// Find Missing Number from 1 to n range in Unsorted array
// Time complexity =O(N^2)
public class missingNumber {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 1, 3, 7 };
        int n = a.length;
        int sum=findMissNumber(a, n+1);
        System.out.println(sum);
    }

    private static int findMissNumber(int[] a, int n) {
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < a.length; i++) {
            sum=sum-a[i];
        }
        return sum;
    }
}
