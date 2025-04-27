class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k = k % n;
        
        int result[] = new int[n];

        for(int i=0; i<n; i++) {
            int newPosition = (i + k) % n;
            result[newPosition] = nums[i];
        }

        for(int i=0; i<n; i++) { 
            nums[i] = result[i];
        }
    }
}
