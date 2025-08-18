# Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
class Solution {
    public int addDigits(int num) {
        //your code goes here
       if(num<10)
       {
            return num;
       }
       int sum=findSum(num);

       return addDigits(sum);
        // alternate solution
    //    if (num == 0) return 0;
    //       return (num - 1) % 9 + 1;
    }
    private int findSum(int num)
    {
        if(num<10)
        {
            return num;

        }
        return num%10+findSum(num/10);
    }
}
