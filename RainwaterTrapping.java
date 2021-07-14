// Trapping Rain Water
// LeetCode #42

public class RainwaterTrapping {
    public static void main(String[] args) {
        int[] a={ 0, 1, 0, 2, 1, 0, 1,
            3, 2, 1, 2, 1 };
        rainwater(a);
    }

    public static void rainwater(int[] a) {
        int n=a.length;
        int result=0;
        if (a.length==0){
            result =0;
            System.out.println(result);
        }
        int[] left=new int[n];
        int[] right=new int[n];

        left[0]=a[0];
        for (int i = 1; i < n; i++) {
            left[i]=Math.max(left[i-1], a[i]);
        }

        right[n-1]=a[n-1];
        for (int i = n-2; i >=0; i--) {
            right[i]=Math.max(right[i+1], a[i]);
        }

        for (int i = 0; i < n; i++) {
            result=result+(Math.min(left[i], right[i])-a[i]);
        }
        System.out.println(result);
    }
}
