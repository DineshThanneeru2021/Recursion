# Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.
  class Solution {
    public int NnumbersSum(int N) {
        //your code goes here
        if(N==1)
        {
            return 1;
        }
        else
        return N+NnumbersSum(N-1);
    }
}
