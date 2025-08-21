# Given an array nums of n integers, return reverse of the array.
  class Solution {
    public int[] reverseArray(int[] nums) {
        //your code goes here
        return reverseFunction(nums,0,nums.length-1);
    }

    private int[] reverseFunction(int[] nums,int l,int r)
    {
        if(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            return reverseFunction(nums,++l,--r);
        }
        return nums;
    }
}
