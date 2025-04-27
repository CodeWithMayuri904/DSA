class Solution {
    public int majorityElement(int[] nums) {
        int count = 0; // it counts the elements from 0
        int Majority = nums[0]; // stores the current potential majority elements

        for(int i=0; i<nums.length; i++) {
            if(count == 0) 
            {
                Majority = nums[i];
                count = 1;
            } 
            else if(nums[i] == Majority) 
            {
                count++;
            }
            else 
            {
                count--;
            }
        }

        return Majority;
        
    } 
}
