package day1;

import java.util.*;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0 ; i<nums.length ; i++)
        {
            if(!hm.containsKey(target-nums[i]))
                hm.put(nums[i],i);
            else{
                ans[1]=i;
                ans[0]=hm.get(target-nums[i]);
            }
        }
        //2nd approach
        // for(int i=0 ; i<nums.length-1 ; i++)
        // {
        //     for(int j=i+1 ; j<nums.length ; j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             ans[0]=i;
        //             ans[1]=j;
        //             break ;
        //         }
        //     }
        // }
        return ans ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
