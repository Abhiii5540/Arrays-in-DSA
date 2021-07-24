public class adjacentElementDiff1 {
    public static void main(String[] args) {
        int a[] = { 8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3 };
        // int a2[]={2,3,2,4,5,6,7};
        int n = a.length;
        int x = 12;
        int res = adElement(a, n, x);
        if (res == -1)
            System.out.println("Number not found");
        else
            System.out.println(x + " is found at index : " + res);

    }
    // Method 1 : Brute force ---- iterating each element and searching 
    // Time Complexity : O(N)

    // private static int adElement(int[] a, int n, int x) {
    //     for (int i = 0; i < a.length; i++) {
    //         if (a[i] == x)
    //             return i;
    //     }
    //     return -1;
    // }

    // Method 2 : Take the differnce and if not matched then skip the elements
    // Time Complexity : O(N) but optimized as it skips several unneccsessary elements

    private static int adElement(int[] a, int n, int x) {
        if(a.length==0)
        return -1;

        int s=0;
        while(s<=a.length){
            if(a[s]==x)
            return s;
            else
            {
                int diff = Math.abs(a[s]-x);
                s=s+diff;
            }
        }
        return -1;
    }
}
