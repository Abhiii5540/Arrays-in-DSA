// Maximum project by buying and selling stock on each day
// brute force techique 
// Time complexity -O(N^2)

// public class maximumProfit {
//     public static void main(String[] args)
// 	{
//         int prices[] = {1, 2, 90, 10, 110};
// 		int max_diff = prices[1] - prices[0];
// 		int i, j;
// 		for (i = 0; i < prices.length; i++)
// 		{
// 			for (j = i + 1; j < prices.length; j++)
// 			{
// 				if (prices[j] - prices[i] > max_diff)
// 					max_diff = prices[j] - prices[i];
// 			}
// 		}
// 		System.out.println(max_diff);
// 	}
// }

// Tricky and Efficient Algorithm
// time complexity O(N)

public class maximumProfit{
    public static void main(String[] args) {
        int prices[] = {1, 2, 90, 10, 110};
        int n=prices.length;
        maxprofit(prices,n);
    }

    private static void maxprofit(int[] prices, int n) {
        int maxProfit=0;
        int minSoFar=prices[0];
        for (int i = 0; i < n; i++) {
            minSoFar=Math.min(minSoFar, prices[i]);
            int profit=prices[i]-minSoFar;
            maxProfit=Math.max(profit, maxProfit);
        }
        System.out.println(maxProfit );
    }
}