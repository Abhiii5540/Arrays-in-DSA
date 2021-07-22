// Elements which are greater than all it's right elements
// Time Complexity - O(N^2) for brute force algo

public class leaderInArray {
    public static void main(String[] args) {
        int a[] = { 16, 17, 4, 3, 5, 2 };
        leadArray(a);
    }

    // private static void leadArray(int[] a) {
    //     for (int i = 0; i < a.length; i++) {
    //         int j;
    //         for (j = i + 1; j < a.length; j++) {
    //             if (a[j] >= a[i]) { /*
    //                                  * the current element is smaller than the next element or thr righter element ,
    //                                  * thrn the loops breaks
    //                                  */
    //                 break;
    //             }
    //         }
    //         if (j == a.length) /* this is done when the loop doesnt breaks */
    //             System.out.println(a[i] + " ");
    //     }
    // }

    // Method 2 : Scan from right
    // Time Complexity : O(N)

    private static void leadArray(int[] a) {
        int max_from_right = a[a.length - 1];
        System.out.println(max_from_right + " "); /*
                                                   * Since the right most element will always be greater as there is no
                                                   * element afterwards and hence leader
                                                   */
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > max_from_right) {
                max_from_right = a[i];
                System.out.println(a[i] + " ");
            }
        }
    }
}
