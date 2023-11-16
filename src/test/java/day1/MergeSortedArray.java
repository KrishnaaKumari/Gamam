package day1;

public class MergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=nums1.length-1 ;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i-- ; k-- ;
            }
            else
            {
                nums1[k]=nums2[j];
                j-- ; k-- ;
            }
        }

        if(i>=0)
        {
            while(i>=0)
            {
                nums1[k]=nums1[i];
                k-- ; i-- ;
            }
        }
        if(j>=0)
        {
            while(j>=0)
            {
                nums1[k]=nums2[j];
                k-- ; j-- ;
            }
        }

        //print
        for(int x=0 ; x<nums1.length ; x++)
        {
            System.out.print(nums1[x]+" ");
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
