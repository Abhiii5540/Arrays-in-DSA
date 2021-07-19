// Quick Sort Algorithm
// Time complexity - O(nlogn)
// in worst case - O(n^2)

public class quicksort {
    public static void main(String[] args) {
        int a[] = { 64, 34, 25, -12, 22, 11, -90 };
        int n = a.length;
        printArray(a);
        qSort(a, 0, (n - 1));
        System.out.println("Sorted array : ");
        printArray(a);
    }

    private static void qSort(int a[], int l, int h) {
        if (l < h) {
            int pivot = partition(a, l, h);
            qSort(a, l, pivot - 1);
            qSort(a, pivot + 1, h);
        }
    }

    public static int partition(int a[], int l, int h) {
        int pivot = a[h];
        int pIndex = l;  /* the index at which pivot is found out after 1 calling of recursion */

        for (int i = l; i < h; i++) {
            if (a[i] < pivot) {
                swap(a, i, pIndex);
                pIndex++;
            }
        }
        swap(a, h, pIndex);
        return pIndex;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
