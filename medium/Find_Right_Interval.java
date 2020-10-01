// #436 Find_Right_Interval
// Java
// pratik ghule

import java.util.*;
class Solution {
    public int[] findRightInterval(int[][] arr) {
        
        int n = arr.length;
        //System.out.println("n="+n);
        int[] ans = new int[n];    
        if(n<=1)
        {
            ans[0] = -1;
        }
        else
        {
            
           // System.out.print(Arrays.deepToString(arr));
            
            for(int i=0;i<n;i++)
            {
                int temp =10000;
                int end = arr[i][1];
                ans[i] = -1;
                //System.out.print(Arrays.toString(ans));
                for(int j=0;j<n;j++)
                {
                    if(i!=j)
                    {
                        if(arr[j][0] >= end && arr[j][0] < temp)
                        {
                            //System.out.println("j="+j);
                            ans[i] = j;
                            temp=arr[j][0];
                        }
                    }
                }
                //System.out.print(Arrays.toString(ans));
            }
        }
                
        return ans;
    }
}
