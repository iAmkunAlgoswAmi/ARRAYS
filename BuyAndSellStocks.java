class BuyAndSellStocks{
	public static void main(String... A){
		int[] prices = {7, 1, 5, 4, 6};
		int[] bestDays = bestBuy(prices);
		System.out.println("BEST DAY TO BUY THE SHARE IS ON DAY : " + bestDays[0]);
		System.out.println("BEST DAY TO SELL THE SHARE IS ON DAY : " + bestDays[1]);
	}
	public static int[] bestBuy(int[] prices){
		int minimumBuy = prices[0];
		int maximumSell = 0;
		int[] bestDay = new int[2];
		for(int i = 1; i < prices.length; i++){
			if(prices[i] <= minimumBuy){
				minimumBuy = prices[i];
				bestDay[0] = i;
			}
			if((i > bestDay[0]) && ((prices[i] - minimumBuy) > maximumSell)){
				bestDay[1] = i;
				maximumSell = prices[i] - minimumBuy;
			}
		}
		return bestDay;
	}
}
