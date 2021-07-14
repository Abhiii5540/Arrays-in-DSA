// this the brute-force way ro solve this problem 
// time-complexity = O(n^2)
class majorityElement {

	static void Majority(int arr[], int n)
	{
        int count = 0;
		int index = -1; 
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count < n/2) {
				count=0;
                // System.out.println("no majority element found");
			}
		else if (count > n / 2){
            index=i;
			System.out.println(arr[index]);
            break;
        }
	}
    }

	public static void main(String[] args)
	{
		int arr[] = {2,4,5,2,2,2,4};
		int n = arr.length;
		Majority(arr, n);
	}
}
