// #229 Majority_Element_II
// Java
// pratik ghule

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        int n = nums.length;
        if(n==0)
            return list;
        if(n==1)
        {
            list.add((Integer)nums[0]);
            return list;
        }
        int count =0;
        int limit = n/3;
        for(int i=0;i<n;i++)
        {
            count=0;
            if(!list.contains(nums[i]))
            {
                for(int j=i;j<n;j++)
                {
                    if(nums[i] == nums[j])
                    {
                        count++;
                    }
                }
                if(count > limit)
                {
                    list.add(nums[i]);
                }    
            }
            
        }
        return list;
    }
}
