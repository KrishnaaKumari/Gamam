package day10;

/*****
 * 
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

 * @author LISA
 *
 */
import java.util.*;
public class LongestPalindromeLengthPossible
{
	public static int lengthPalindrome(String s)
	{
		int len=0;
		HashSet<Character>hs= new HashSet<Character>();
		for(int i=0 ; i<s.length() ; i++)
		{
			if(hs.contains(s.charAt(i)))
			{
				len=len+2;
				hs.remove(s.charAt(i));
			}
			else
			{
				hs.add(s.charAt(i));
			}
		}
		if(hs.size()!=0)
			return ++len ;
		else
			return len ;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(lengthPalindrome("abccccdd"));

	}

}
