package day11;

public class ReverseString {
	
	public static void reverseString(char[]s)
	{
		for(int i=0,j=s.length-1 ; i<s.length/2 ; i++,j--)
        {
            char ch=s[i];
            s[i]=s[j];
            s[j]=ch ;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]s= {'h','e','l','l','o'};
		reverseString(s);
		for(char c : s)
			System.out.print(c+" ");

	}

}
