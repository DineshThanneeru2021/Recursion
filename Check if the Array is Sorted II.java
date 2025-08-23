# Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.
class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {

        //your code goes here
        return sortedFunction(nums,0,nums.size()-1);
    }
    private boolean sortedFunction(ArrayList<Integer> nums,int i,int r)
    {
        if(i>=r)
        {
            return true;
        }
        if (nums.get(i)>nums.get(i+1))
        {
            return false;

        }

             
            
        return sortedFunction(nums,i+1,r);
            
            
        
        
        
    }
}
