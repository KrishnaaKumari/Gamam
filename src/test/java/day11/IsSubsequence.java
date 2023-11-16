package day11;

/****
 *     j
 *  abcd
 *        i
 * asdbdecdfg
 * 
 * @author LISA
 *
 */
public class IsSubsequence {
	
	public static boolean isSubsquence(String sub, String str)
	{
		int i=0, j=0;
		while(i<str.length()&&j<sub.length())
		{
			if(sub.charAt(j)==str.charAt(i))
			{
				i++ ; j++ ;
			}
			else
			{
				i++;
			}
		}
		if(j==sub.length())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isSubsquence("axcd","asdbdecdfg"));

	}

}
