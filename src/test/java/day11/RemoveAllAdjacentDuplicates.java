package day11;

import java.util.*;
public class RemoveAllAdjacentDuplicates {
	
	public String removeDuplicates(String s)
	{	
		Stack<Character> st = new Stack<Character>();
        for(int i=0 ; i<s.length() ; i++)
        {
            if(st.size()>0 && st.peek()==s.charAt(i))
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        String str="";
        for(Character c : st)
        {
            str=str+c ;
        }
        return str ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
