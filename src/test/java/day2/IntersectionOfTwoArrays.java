package day2;

/****
 * 
 * 
 * 349. Intersection of Two Arrays
Solved
Easy
Topics
Companies

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

 */
import java.util.*;
public class IntersectionOfTwoArrays {
	
	public static int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> ans= new HashSet<Integer>(); 
        for(int i=0 ; i<nums1.length ; i++)
            hs.add(nums1[i]);
        
        for(int i=0 ; i<nums2.length ; i++)
        {
            if(hs.contains(nums2[i]))
                ans.add(nums2[i]);
        }

        int arr[]= new int[ans.size()];
        int j=0 ;
        for(Integer i : ans)
        {
            arr[j]=i; j++ ;
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
