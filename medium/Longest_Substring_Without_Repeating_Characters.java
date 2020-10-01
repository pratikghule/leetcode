// #3 Longest_Substring_Without_Repeating_Characters
// Java
// pratik ghule



import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        int n = s.length();
        if(n==0)
            return 0;
        ArrayList<Character> list = new ArrayList<Character>();
        int ans=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            //System.out.println("i="+i);
            for(int j=i;j<n;j++)
            {
               // System.out.println("j="+j);
                if(!list.contains(s.charAt(j)))
                {
                    ans++;
                  //  System.out.println("ans="+ans);
                    list.add(s.charAt(j));
                  //  System.out.println("\t list="+list);
                }
                else
                {
                    list.clear();
                    if(ans>max)
                        max=ans;
                  //  System.out.println("max="+max);
                    ans=0;
                    break;
                }    
            }
            if(ans>max)
                max=ans;
            if(ans==n)
                return n;
        }
        return max;
    }
}
