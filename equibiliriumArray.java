// Equilibrium point where elements before & after it has equal sum
// Time complexity : O(N)

public class equibiliriumArray {
    public static void main(String[] args) {
        int a[] = { -7, 1, 5, 2, -4, 3, 0 };
        int x = equiArray(a);
        System.out.println("The equilibirium point is : " + x);
    }

    private static int equiArray(int[] a) {
        if (a.length == 1) {
            return 0;
        }
        int sum = 0, leftSum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        for (int i = 0; i < a.length; i++) {
            sum = sum - a[i];
            if (sum == leftSum)
                return i;

            leftSum = leftSum + a[i];
        }
        return -1;
    }

    // Brute force approach
    // Time complexity : O(N^2)

    // private static int equiArray(int[] a) {
    // int i, j;
    // int leftsum, rightsum;
    // if(a.length==1){
    // return 0;
    // }
    // for (i = 0; i < a.length; i++) {
    // leftsum = 0;
    // for (j = 0; j < i; j++)
    // leftsum += a[j];

    // rightsum = 0;
    // for (j = i + 1; j < a.length; j++)
    // rightsum += a[j];

    // if (leftsum == rightsum)
    // return i;
    // }
    // return -1;
    // }
}
