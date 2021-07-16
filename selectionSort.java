public class selectionSort {
    public static void main(String[] args) {
        int a[] = { 64, 34, 25, -12, 22, 11, -90 };
        printArray(a);
        selSort(a);
        System.out.println("Sorted array : ");
        printArray(a);
    }
    private static void selSort(int[] a) {
        int n=a.length;
        for (int i = 0; i < n-1; i++) {
                int min=i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if (min!=i) {
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }

        }
    }
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
