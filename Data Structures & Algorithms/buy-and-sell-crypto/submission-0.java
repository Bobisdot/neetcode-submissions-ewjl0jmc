class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int Maxprof = 0;
        for(int price:prices){
            if(price<min){
                min = price;
            }
            int profit = price - min;
            Maxprof = Math.max(Maxprof,profit);
        }
        return Maxprof;
        
    }
}
