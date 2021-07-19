// Sort an array of 0's 1's & 2's 
// Dutch National Flag Problem Algorithm -- [0-low-1]--> denoted for 0 [high+1 se 0] denoted 2 and 
// [low+1 se mid] denoted 1
// Time complexity : O(N)
// Space complexity : O(1)
public class dutchNationalFlag {
    public static void main(String[] args) {
        int a[] = { 1, 0, 0, 1, 2, 2, 0, 2, 1, 0, 0, 2, 1, 0 };
        System.out.println("Original Array : ");
        printArray(a);
        sort012(a);
        System.out.println("Array after sorting : ");
        printArray(a);
    }

    public static void sort012(int[] a) {
        int l = 0;
        int h = a.length - 1;
        int mid = 0;
        while (mid <= h) {
            switch (a[mid]) {
                case 0: {
                    swap(a, l, mid);
                    l++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    swap(a, mid, h);
                    h--;
                    break;
                }
            }
        }
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
