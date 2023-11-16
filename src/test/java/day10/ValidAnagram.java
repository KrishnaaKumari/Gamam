package day10;

import java.util.Arrays;

public class ValidAnagram {
	
	public static boolean isAnagram(String s, String t)
	{
		
		if(s.length()!=t.length())
            return false ;
		char[] s11=s.toCharArray();
		char[] t11=t.toCharArray();
		Arrays.sort(s11);
		Arrays.sort(t11);
		for(int i=0 ; i<s11.length&&i<t11.length ; i++)
		{
			if(s11[i]==t11[i])
				continue ;
			else {
				return false ;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("anagrams","anagram"));
		System.out.println(isAnagram("anagram","anagram"));
	}

}
