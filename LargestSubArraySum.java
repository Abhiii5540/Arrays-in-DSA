// this is the brute-force way to solve this problem 
// time-complexity = O(n^2)

// public class LargestSubArraySum {
//     public static void main(String[] args) {

//         int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
//         int n = a.length;

//         int maxSum = -1;
//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {
//                 sum = sum + a[j];
//                 if (sum > maxSum) {
//                     maxSum = sum;
//                 }
//             }
//         }
//         System.out.println(maxSum);

//     }

// }

// Kadane's Algorithm
// Time-complexity = O(N)

public class LargestSubArraySum {
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        MaximumSubArraySum(a, n);
    }

    private static void MaximumSubArraySum(int[] a, int n) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}