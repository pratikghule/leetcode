// #4 Median_Of_Two_Sorted_Arrays
// Java
// pratik ghule

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        double ans=0;
        if(n1==0 && n2==0 )
            return ans;
        else if(n1==0 && n2==1)
            return nums2[0];
        else if(n2==0 && n1==1)
            return nums1[0];
        else if(n1==0)
        {
            if(n2%2==1)
                return nums2[n2/2];
            else
            {
                return ((double)nums2[n2/2]+nums2[(n2/2)-1])/(double)2;
            }
        }
        else if(n2==0)
        {
            if(n1%2==1)
                return nums1[n1/2];
            else
            {
                return (double)(nums1[n1/2] + nums1[(n1/2)-1] ) / 2;
            }
        }
        
        int[] arr = new int[n1+n2];
        for(int i=0;i<n1;i++)
        {
            arr[i] = nums1[i];
        }
        for(int i=n1;i<n1+n2;i++)
        {
            arr[i] = nums2[i-n1];
        }
        Arrays.sort(arr);
        if((n1+n2)%2==1)
            return (double)arr[(n1+n2)/2];
        else
            return (double)(arr[(n1+n2)/2] + arr[((n1+n2)/2)-1] ) /2;
    }
}
