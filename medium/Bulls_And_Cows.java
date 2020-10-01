// #299 Bulls_And_Cows
// Java
// pratik ghule

class Solution {
    public String getHint(String secret, String guess) {
        
        int nbull=0, ncow=0;
        char dot='.',hash='#';
        int n = secret.length();
        char[] asecret = new char[n];
        char[] aguess = new char[n];
        
        for(int i=0;i<n;i++)
        {
            asecret[i] = secret.charAt(i);
            aguess[i] = guess.charAt(i);
        }
        
        secret=null;
        guess=null;
        for(int i=0;i<n;i++)
        {
            if(asecret[i] == aguess[i])
            {
                nbull++;
                asecret[i] = dot;
                aguess[i] = hash;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(aguess[i] == asecret[j])
                {
                    ncow++;
                    asecret[j] = dot;
                    aguess[i] = hash;
                    break;
                }   
            }
        }
        
        String ans = nbull + "A" + ncow + "B" ;
        return ans;
    }
}
