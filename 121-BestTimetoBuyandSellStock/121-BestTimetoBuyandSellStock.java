// Last updated: 6/24/2026, 11:18:10 AM
   public int maxProfit(int[] arr) {
       int min = arr[0];
       int maxProfit = Integer.MIN_VALUE;
       for(int i=1; i<arr.length; i++){
           int profit = arr[i] - min;
           min = Math.min(min, arr[i]);//to update minimum value
           maxProfit = Math.max(maxProfit, profit);//to update maximum profit
       }
       if(maxProfit <=0) return 0;
       return maxProfit;
   }