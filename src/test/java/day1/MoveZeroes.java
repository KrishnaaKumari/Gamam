package day1;

public class MoveZeroes {
	
	public static void moveZeroes(int[] nums)
	{
        int i=0, j=0 ;
        while(i<nums.length)
        {
            if(nums[i]!=0)
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t ;
                j++ ;
            }
            i++ ;
        }        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
