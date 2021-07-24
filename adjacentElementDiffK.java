public class adjacentElementDiffK {
    public static void main(String[] args) {
        // int a[] = { 80, 70, 60, 70, 60, 50, 40, 30, 20, 30, 40, 30 };
        int a[]={2,3,2,4,5,6,7};
        int n = a.length;
        int x = 3;
        int k=2;
        int res = adElementByK(a, n, x , k);
        if (res == -1)
            System.out.println("Number not found");
        else
            System.out.println(x + " is found at index : " + res);

    }
    // Method 1 : Brute force ---- iterating each element and searching 
    // Time Complexity : O(N)

    // private static int adElementByK(int[] a, int n, int x ) {
    //     for (int i = 0; i < a.length; i++) {
    //         if (a[i] == x)
    //             return i;
    //     }
    //     return -1;
    // }

    // Method 2 : Take the differnce and if not matched then skip the elements
    // Time Complexity : O(N) but optimized as it skips several unneccsessary elements
        
    private static int adElementByK(int[] a, int n, int x, int k) {
        if(a.length==0)
        return -1;

        int s=0;
        while(s<=a.length){
            if(a[s]==x)
            return s;
            else
            {
                int diff = Math.abs(a[s]-x)/k;
                diff=Math.max(1,diff);
                s=s+diff;
            }
        }
        return -1;
    }

}
