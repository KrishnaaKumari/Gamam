package day10;
/****
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

 * @author LISA
 *
 */

public class ValidPalindrome1 {
	
	public static boolean isPalindrome(String s)
	{
		
		s=s.toLowerCase();
		String str="";
		for(int i=0 ; i<s.length() ; i++)
		{
			if(Character.isLetterOrDigit(s.charAt(i)))
				str=str+s.charAt(i);
		}
		for(int i=0 , j=str.length()-1 ; i<str.length()/2 ; i++, j--)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false ;
		}
		return true ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
	}

}
