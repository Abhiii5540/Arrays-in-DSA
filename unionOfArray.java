import java.util.ArrayList;
import java.util.HashSet;

public class unionOfArray {

  public static void main(String[] args) {

    unionOfArray a = new unionOfArray();
    int a1[] = { 2, 2, 3, 4, 4, 4, 7, 8 };
    int a2[] = { 1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10 };
    int a3[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
    int a4[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> list2 = new HashSet<Integer>();

    a.unionOfTwoSortedArray(a1, a2, list);
    a.unionOfTwoUnSortedArray(a3, a4, list2);
    System.out.println(list);
    System.out.println(list2);

  }

  // Time Complexity : O(m+n)
  // union Of Two Sorted Array

  public void unionOfTwoSortedArray(int[] a1, int[] a2, ArrayList<Integer> list) {
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
        list.add(a1[i++]);
      } else if (a1[i] > a2[j]) {
        list.add(a2[j++]);
      } else {
        list.add(a1[i]);
        i++;
        j++;
      }
    }

    while (i < a1.length) {
      if (i < a1.length - 1 && a1[i] == a1[i + 1]) {
        i++;
      } else {
        list.add(a1[i++]);
      }
    }

    while (j < a2.length) {
      if (j < a2.length - 1 && a2[j] == a2[j + 1]) {
        j++;
      } else {
        list.add(a2[j++]);
      }
    }
  }

  // Time Complexity : O(m+n)
  // Space Complexity : O(m+n)
  // union Of Two UnSorted Array

  private void unionOfTwoUnSortedArray(int[] a3, int[] a4, HashSet<Integer> list2) {
    int i = 0;
    int j = 0;
    while (i < a3.length) {
      list2.add(a3[i++]);
    }
    while (j < a4.length) {
      list2.add(a4[j++]);
    }
  }

}
