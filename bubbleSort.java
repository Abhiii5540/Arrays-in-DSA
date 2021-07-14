public class bubbleSort {
    public static void main(String[] args) {
        int a[] = { 64, 34, 25, -12, 22, 11, -90 };
        printArray(a);
        bsort(a);
        System.out.println("Sorted array : ");
        printArray(a);
    }

    public static void bsort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    swapped = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
