package day2;

import java.util.* ;
public class RemoveDuplicatesFromSortedArray2
{
	 public static  int removeDuplicates(int[] nums) {
	        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        int cnt=0, j=0 ;
	        for(int i=0 ; i<nums.length ; i++)
	        {
	            if(!hm.containsKey(nums[i]))
	            {
	                hm.put(nums[i],1);
	                cnt++ ; 
	                nums[j]=nums[i];
	                j++ ;
	            }
	            else
	            {
	                if(hm.get(nums[i])<2)
	                {
	                    int c = hm.get(nums[i]);
	                    hm.put(nums[i],c+1);
	                    nums[j]=nums[i];
	                    j++ ; cnt++ ;
	                }
	            }
	        }
	        return cnt ;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
