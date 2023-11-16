package day10;


/****
 * c1=1
 *  l   
 * acccba
 *    h
 * 
 * aabccaa
 * 
 * @author LISA
 *Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 

Example 1:

Input: s = "aba"
Output: true

Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:

Input: s = "abc"
Output: false

 */

public class ValidPalindrome2 {
	
	public static boolean isPalindrome(String s)
	{
		int c1=0, c2=0;
		int low=0, high=s.length()-1;
		while(low<high)
		{
			if(s.charAt(low)==s.charAt(high))
			{
				low++ ; high--;
			}
			else
			{
				low++ ; c1++ ;
			}
		}
		low=0;high=s.length()-1;
		while(low<high)
		{
			if(s.charAt(low)==s.charAt(high))
			{
				low++ ; high--;
			}
			else
			{
				high-- ; c2++ ;
			}
		}
		if(c1==0||c1==1||c2==0||c2==1)
			return true;
		return false ;
	}
	public static void main(String[]args)
	{
		System.out.println(isPalindrome("aba"));
		System.out.println(isPalindrome("aabcccxaa"));
	}

}
