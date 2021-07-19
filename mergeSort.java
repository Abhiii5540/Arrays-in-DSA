// Quick Sort Algorithm
// Time complexity - O(nlogn)

public class mergeSort {
    public static void main(String[] args) {
        int a[] = { 1, 4, 2, 4, 2, 4, 1, 2, 4, 1, 2, 2, 2, 2, 4, 1, 4, 4, 4 };
        int n = a.length;
        printArray(a);
        mSort(a, 0, n - 1);
        System.out.println("Sorted array : ");
        printArray(a);
    }

    private static void mSort(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mSort(a, l, mid);
            mSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }

    private static void merge(int[] a, int l, int mid, int r) {
        int[] b = new int[a.length];
        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= r) {
                b[k] = a[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }
        for (k = l; k <= r; k++) {
            a[k] = b[k];
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
