# Given an integer n, return the factorial of n.



Factorial of a non-negative integer, is the multiplication of all integers smaller than or equal to n (use 64-bits to return answer).
  class Solution {
    public long factorial(int n) {
        //your code goes here
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
}
