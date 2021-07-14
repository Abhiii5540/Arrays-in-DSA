// / Maximum project by buying and selling stock on each day
// time complexity = O(N)

public class maximumProfit2 {
    public static void main(String[] args) {
        int prices[]={5,2,6,1,4,7,3,6};
        maxProfit(prices);
    }

    private static void maxProfit(int[] prices) {
        int profit=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                profit = profit + (prices[i]-prices[i-1]);
            }
            
        }
        System.out.println(profit);
    }
        
    }
