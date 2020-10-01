// #470 Implement_Rand10()_Using_Rand7()
// Java
// pratik ghule

/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() 
    {
        int ans=rand7();
        List list = Arrays.asList(3,8,7,9,5,1,4,6,10,2);
       // System.out.println("List: "+list);  
        Collections.shuffle(list); 
       // System.out.println("List: "+list);  
        ans= (int)list.get( ans );
        //System.out.println( ans );
        
        
        return ans;
    }
}
