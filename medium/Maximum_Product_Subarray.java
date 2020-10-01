// #152 Maximum_Product_Subarray
// Java
// pratik ghule

class Solution {
    public int maxProduct(int[] nums) {
        
        
        int max = (-2)^31;
        int product = 1;
        int n = nums.length;
        
        for(int i=0;i<n;i++)
        {
            //System.out.println("i="+i);
            for(int j=i;j<n;j++)
            {
               // System.out.println("j="+j);
                product *= nums[j];
                if(product > max)
                {
                    max = product;
                }
               // System.out.println("product="+product);
               // System.out.println("max="+max);
            }
            product = 1;
        }
        return max;
    }
}
