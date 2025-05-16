class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0; //ans
        int lp = 0;
        int rp = height.length - 1;

        while( lp < rp) {
            int width = rp - lp;
            int minHeight = Math.min(height[lp] , height[rp]);
            int currWater = width * minHeight;  // area

            maxWater = Math.max(maxWater, currWater);

            if(height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxWater;
    }
}
