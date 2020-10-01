// #29 Divide_Two_Integers
// Java
// pratik ghule


class Solution {
    public int divide(int a, int b) {
        
        if(a>0&&b>0)
            return a/b;
        else if(a<0&&b>0)
            return a/b;
        else if(a>0&&b<0)
            return a/b;
        else //if(a<0&&b<0)
        {
            
            if((a/b)< -((2)^31)-1)
                return Integer.MAX_VALUE;
            else
                return a/b;
        }
        
    }
}
