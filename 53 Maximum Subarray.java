class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int current = 0;
        for(int i=0; i<nums.length; i++) {
            current += nums[i];
            if(current > maxSum)
                maxSum = current;
            if(current < 0)
                current = 0;
        }
        return maxSum;
    }
}