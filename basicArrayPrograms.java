public class basicArrayPrograms 
{
    public static void main(String[] args) {
        int arr[] = {2, 0, 43, 0, -65};
        System.out.print("Original array is \n");
        printArray(arr);
        reverse(arr, 0, arr.length-1);
        System.out.print("Reversed array is \n");
        printArray(arr);
        findMinimum(arr);
        findMaximum(arr);
        moveZeros(arr);
        System.out.print("New array after moving zeroes : ");
        printArray(arr);
    }

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length ;i++)
             System.out.print(arr[i] + " ");  
         System.out.println();
    }

    // Function to reverse an array
    public static void reverse(int[] arr , int start , int end) {
        for (start = 0; start < end ; start++) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
        }  
    }

    // function to find minimun number in an array 

    public static void findMinimum(int[] arr) {
        // edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number in an array is : " +min);
    }

     // function to find maximun number in an array 
    public static void findMaximum(int[] arr) {
        // edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number in an array is : " +max);
    }

     // function to move Zeroes to end of an Array
     public static void moveZeros(int[] arr){
        int j = 0; // focus on zeroth elements
        for(int i = 0; i < arr.length; i++) { // i will focus non zero elements
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
}
    

