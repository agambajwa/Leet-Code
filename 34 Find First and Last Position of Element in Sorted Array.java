class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] result = {-1, -1};
        if(n == 0)
            return result;
        
        int firstIndex = modifiedBinarySearch(nums, target, true);
        
        if(firstIndex >= nums.length || nums[firstIndex] != target) 
            return result;
        
        result[0] = firstIndex;
        result[1] = modifiedBinarySearch(nums, target, false)-1;
        
        return result;
    }
    
    public int modifiedBinarySearch(int[] nums, int target, boolean left) {
        int start = 0;
        int end = nums.length;
        
        while(start < end) {
            int middle = start + (end - start)/2;
            
            if(nums[middle] > target || (left && nums[middle] == target))
                end = middle;
            else 
                start = middle+1;
        }
        
        return start;
    }
}