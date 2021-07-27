import java.util.ArrayList;
import java.util.HashSet;

public class intersectionOfArray {

    public static void main(String[] args) {

        intersectionOfArray a = new intersectionOfArray();
        int a1[] = { 2, 2, 3, 4, 4, 4, 7, 8 };
        int a2[] = { 1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10 };
        int a3[] = { 7, 1, 5, 2, 3, 6 };
        int a4[] = { 3, 8, 6, 20, 7 };
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> list2 = new HashSet<Integer>();

        a.intersectionOfTwoSortedArray(a1, a2, list);
        a.intersectionOfTwoUnSortedArray(a3, a4, list2);
        System.out.println(list);
        System.out.println(list2);
    }

    // Time Complexity : O(m+n)
    // union Of Two Sorted Array
    public void intersectionOfTwoSortedArray(int[] a1, int[] a2, ArrayList<Integer> list) {
        int i = 0;
        int j = 0;

        while (i < a1.length && j < a2.length) {
            while ((i < a1.length - 1) && (a1[i] == a1[i + 1])) {
                i++;
            }

            while ((j < a2.length - 1) && (a2[j] == a2[j + 1])) {
                j++;
            }

            if (a1[i] < a2[j]) {
                i++;
            } else if (a1[i] > a2[j]) {
                j++;
            } else {
                list.add(a1[i]);
                i++;
                j++;
            }
        }
    }

    // Time Complexity : O(m+n)
    // Space Complexity : O(n)
    // Intersection Of Two UnSorted Array
    private void intersectionOfTwoUnSortedArray(int[] a3, int[] a4, HashSet<Integer> list2) {
        int i = 0;
        int j = 0;
        HashSet<Integer> Temp = new HashSet<Integer>();
        while (i < a3.length) {
            Temp.add(a3[i++]);
        }
        while (j < a4.length) {
            if (Temp.contains(a4[j])) {
                list2.add(a4[j++]);
            }
            j++;
        }
    }
}
