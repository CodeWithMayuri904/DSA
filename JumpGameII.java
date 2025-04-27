class Solution {
    public int jump(int[] nums) {
        int jumps = 0; //to count the no. of jumps
        int currentEnd = 0; //the end of the range we can reach with current jump
        int farthest = 0;

        for(int i=0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]); //Update the farthest index 
 
            if(i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    } 
}
