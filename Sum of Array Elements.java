# Given an array nums, find the sum of elements of array using recursion.
class Solution {
    public int arraySum(int[] nums) {
        //your code goes here
        return findSum(nums,0);
    }
    private int findSum(int[] nums,int left)
    {
        if(left>=nums.length)
        {
            return 0;
        }
        else
        {
            return nums[left]+findSum(nums,left+1);
        }

    }
}
