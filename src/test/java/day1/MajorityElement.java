package day1;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
        int cnt=0 ;
        int fcnt=0 ;
        int maj=nums[0];
        for(int i=0 ; i<nums.length ; i++)
        {
            if(cnt==0)
            {
                maj=nums[i];
                cnt++ ;
            }
            else if(nums[i]==maj)
            {
                cnt++ ;
            }
            else if(nums[i]!=maj)
            {
                cnt-- ;
            }
        }

        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]==maj)
            fcnt++ ;
        }

        if(fcnt>nums.length/2)
            return maj ;

        return -1 ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
