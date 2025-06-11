class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow = Integer.MAX_VALUE;
        int currentSum = 0;

        // Start 2 pointers sliding window
        int low = 0;
        int high = 0;

        // Find current sum & increase window size
        while(high < nums.length) {
            currentSum += nums[high];
            high++;

            //Try to reduce window size
            while(currentSum >= target) {
                int currentWindowSize = high - low;

                // Update minimum length of window
                minLenWindow  = Math.min(minLenWindow, currentWindowSize);

                currentSum -= nums[low];
                low++;
            }

        }
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;

    }
}
