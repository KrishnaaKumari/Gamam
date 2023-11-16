package day11;

public class ReverseString2 {
	
	public static void reverseString(int s, int e, char[]str)
	{
		for(int i=s,j=e ; i<j ; i++,j--)
        {
            char ch=str[i];
            str[i]=str[j];
            str[j]=ch ;
        }
	}
	
	public static String reverseStr(String s, int k)
    {
        char []arr=s.toCharArray();
        for(int i=0 ; i<arr.length ; i=i+2*k)
        {
            int j=Math.min(i+k-1,s.length()-1);
            reverseString(i,j,arr);
        }
        return (new String(arr));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=2;
		String str="";
		String ans=reverseStr("abcdefg",k);
		System.out.println(ans);

	}

}
