package day1;

public class BuySellStock {
	
	public static int maxProfit(int[] nums) {
        int cost=0 ;
        int min=nums[0];
        int profit=0 ;
        for(int i=1 ; i<nums.length ; i++)
        {
            cost=nums[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,nums[i]);
        }
        return profit ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
