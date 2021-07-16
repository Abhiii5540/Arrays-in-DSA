public class insertionSort {
    public static void main(String[] args) {
        int a[] = { 64, 34, 25, -12, 22, 11, -90 };
        printArray(a);
        isort(a);
        System.out.println("Sorted array : ");
        printArray(a);
    }

    public static void isort(int[] a) {
        int n=a.length;
        for (int i = 0; i < n; i++) {
            int temp=a[i];
            int j=i-1;
            while (j>=0 && a[j]>temp) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
