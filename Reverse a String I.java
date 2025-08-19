# Given an input string as an array of characters, write a function that reverses the string.




  class Solution {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        //your code goes here
        return reverseFunction(s,0,s.size()-1);
    }
    
    private ArrayList<Character> reverseFunction(ArrayList<Character> s,int l,int r)
    {
        if(l<r)
        {
            char ch=s.get(l);
            s.set(l,s.get(r));
            s.set(r,ch);
            return reverseFunction(s,++l,--r);
        }
        else 
         return s;
    }
}
