class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int minimum=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-minimum;
            if(cost > profit){
                profit=cost;
            }
            if(prices[i]<minimum){
                minimum=prices[i];
            }
        }
        return profit;
        
    }
}