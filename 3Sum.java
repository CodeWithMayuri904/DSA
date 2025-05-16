class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if( i>0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;

            while(left < right) {
                //skip dulicate elements for i...
                int sum = nums[i] + nums[left] + nums[right]; 
                
                if(sum < 0) {
                    left++;
                }   
                else if(sum > 0) {
                    right--;
                } 
                else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                    left++;
                    right--;

                    //skip duplicates if needed
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }       
            }
        }
        return result;
    }
}
