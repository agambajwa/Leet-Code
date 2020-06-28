class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        
        int result = 1;
        int last = nums[0];
        
        for(int i=1; i<len; i++) {
            if(nums[i] != last) {
                last = nums[i];
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}