package day3;
/****
 * 
 * 
 * 941. Valid Mountain Array
Solved
Easy
Topics
Companies
Hint

Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
        arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 * @author LISA
 *
 */
public class ValidMountainArray {
	
	public static boolean validMountainArray(int[] arr)
	{
        boolean inc=false;
        boolean dec=false;
        for(int i=1 ; i<arr.length ; i++)
        {
            if(arr[i-1]<arr[i])
            {
                if(dec==true)
                    return false ;
                inc=true ;

            }
            else if(arr[i-1]>arr[i])
            {
                if(inc==false)
                	return false ;
                dec=true ;
            }
            else if(arr[i-1]==arr[i])
            return false ;
        }

        if(inc==true&& dec==true)
            return true ;
        
        return false ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Example 1:

Input: arr = [2,1]
Output: false

Example 2:

Input: arr = [3,5,5]
Output: false

Example 3:

Input: arr = [0,3,2,1]
Output: true

		 * 
		 */

	}

}
