package day10;

import java.util.*;
public class LongestCommonPrefix {

	public static String longestPrefix(String[] arr)
	{
		//method-1
//		Arrays.sort(arr);
//		String ans="";
//		String s1=arr[0];
//		String s2=arr[arr.length-1];
//		for(int i=0 ; i<s1.length() && i<s2.length(); i++)
//		{
//			if(s1.charAt(i)==s2.charAt(i))
//				ans=ans+s1.charAt(i);
//			else
//				break ;
//		}
//		return ans ;
		
		
		//method-2
		String prefix=arr[0];
		for(String s:arr)
		{
			while(s.indexOf(prefix)!=0)
			{
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
		return prefix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr= {"flower","flow","flight"};
		System.out.println(longestPrefix(arr));

	}

}
