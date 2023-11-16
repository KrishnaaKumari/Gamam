package day1;

public class SquareOfSortedArray {
	
	public static int[] sortedSquares(int[] nums)
    {
        // for(int i=0 ; i<nums.length ; i++)
        //     nums[i]=nums[i]*nums[i];   

        // Arrays.sort(nums);
        // return nums;
        int i=0, j=nums.length-1;
        int res[]= new int[nums.length];
        int k=nums.length-1;
        while(i<=j)
        {
            int n1=nums[i]*nums[i];
            int n2=nums[j]*nums[j];
            if(n1<=n2)
            {
                res[k]=n2;
                j-- ;
            }
            else
            {
                res[k]=n1;
                i++ ;
            }
            k-- ;
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
