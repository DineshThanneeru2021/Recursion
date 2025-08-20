# Given a string s, return true if the string is palindrome, otherwise false.


class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        return palindromeFunction(s,0,s.length()-1);
    }
    private boolean palindromeFunction(String s,int l,int r)
    {
        if(l<r)
        {
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(ch1==ch2)
            {
                return palindromeFunction(s,++l,--r);
            }
            else
            return false;

        }
        return true;
        
    }
}
  
