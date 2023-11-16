package day2;
/***
 * 
 * 
 * 
 * 268. Missing Number
Solved
Easy
Topics
Companies

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.


 */

import java.util.*;
public class MissingNumber {
	
	 public static int missingNumber(int[] nums) {
//	        Arrays.sort(nums);
//	        int i=0 ;
//	        for(; i<nums.length ; i++)
//	        {
//	            if(i!=nums[i])
//	            return i ;
//	        }
//	        return i ;
		 
		 int n = nums.length;
	        int sum = n*(n+1)/2;
	        int s = 0;
	        for(int i=0;i<n;i++){
	            s += nums[i];
	        }
	        return sum-s;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
