package day11;

import java.util.*;
public class IsomorphicString {
	
	public static boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length())
        return false;
        HashMap<Character, Integer> h1= new HashMap<Character, Integer>();
        HashMap<Character, Integer> h2= new HashMap<Character, Integer>();
        for(Integer i=0 ; i<s.length() ; i++)
        {
            if(h1.put(s.charAt(i),i)!=h2.put(t.charAt(i),i))
            return false ;
        }
        return true ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "egs", t = "add";
		System.out.println(isIsomorphic(s,t));
	}

}
