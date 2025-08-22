# Given an integer num, return true if it is prime otherwise false.
A prime number is a number that is divisible only by 1 and itself.

  class Solution {
    public boolean checkPrime(int num) {
        //your code goes here
        if(num<=1)
         return false;
        return primeFunction(num,(int)Math.sqrt(num));
    }
    private boolean primeFunction(int num,int factor)
    {
        if(factor==1)
         return true;
        if(num%factor==0)
        {
            return false;
        }
        return primeFunction(num,factor-1);
    }

}
  
