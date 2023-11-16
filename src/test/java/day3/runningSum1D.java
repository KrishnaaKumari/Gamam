package day3;
/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

 * 
 */
import java.util.* ;
public class runningSum1D {
	
	public static int[] runningSum(int[] nums) {
		int sum=0 ;
		int[]ans=new int[nums.length];
		for(int i=0 ; i<nums.length ; i++)
		{
			sum=sum+nums[i];
			ans[i]=sum ;
		}
        return ans ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements in array: ");
		int[]arr= new int[size];
		for(int i=0 ; i<size ; i++)
			arr[i]=sc.nextInt();
		int a[]=runningSum(arr);
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i]+" ");
		
	}

}
