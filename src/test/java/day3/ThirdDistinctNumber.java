package day3;

import java.util.*;
public class ThirdDistinctNumber {
	
public  static int thirdMax(int[] nums) {
        
        Arrays.sort(nums);
        HashSet<Integer> hs= new HashSet<Integer>();
        for(int i=nums.length-1 ; i>=0; i--)
        {
            int val=nums[i];
            hs.add(val);
            if(hs.size()==3)
                return val ;
        }
        return nums[nums.length-1] ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
