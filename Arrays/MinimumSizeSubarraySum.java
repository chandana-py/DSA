class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0;right<n;right++){
            sum += nums[right];
            while(sum >= target){
                min_length = Math.min(min_length,right-left+1);
                sum -= nums[left];
                left++;

            }
        }
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}
