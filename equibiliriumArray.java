// Equilibrium point where elements before & after it has equal sum
// Time complexity : O(N)

public class equibiliriumArray {
    public static void main(String[] args) {
        int a[]={1,2,6,4,0,-1};
        int x=equiArray(a);
        System.out.println("The equilibhirium point is : "+x);
    }
    private static int equiArray(int[] a) {
        if(a.length==0){
            return -1;
        }
        int sum=0 , sum_so_far=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }

        for (int i = 0; i < a.length; i++) {
            sum=sum-a[i];
            if(sum==sum_so_far)
            return i;
            
            sum_so_far = sum_so_far + a[i];
        }
        return -1;
    }
}
