package LeetCodeMustToSolve;

public class BuyNSellStock {
	
	public static int maxprofit(int prices[], int n) {
		char ch[] = {'A','B'};
		String s = "geeks";
		char ch1[] = s.toCharArray();
		System.out.println(ch1);
		int buy = prices[0];
		int max_profit =0;
		for(int i =1;i<n;i++) {
			if(prices[i]<buy) {
				buy = prices[i];
			}
			
			else if (prices[i]-buy>max_profit) {
				max_profit = prices[i]-buy;
			}
		}
		return max_profit;
	}
	
	public static int overAllProfit(int prices[], int n) {
		int buy = prices[0];
		int overall_profit = 0;
		for(int i=1;i<n;i++) {
			if(prices[i]<buy) {
				buy =prices[i];
			}
			
			else if (prices[i]>buy) {
				overall_profit = overall_profit+(prices[i]-buy); 
			}
		}
		return n;
		
	}

	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 6, 4 };
        int n = prices.length;
        int max_profit = maxprofit(prices, n);
        System.out.println(max_profit);
	}

}
