class Solution {
    public int search(int[] nums, int target) {
        
        if(nums == null || nums.length == 0) 
            return -1;
        
        int pivot = 0;
        int end = nums.length - 1;
        
        while(nums[pivot] > nums[end]) {
            int middle = pivot + (end - pivot)/2;
            if(nums[middle] > nums[end])
                pivot = middle + 1;
            else 
                end = middle;
        }
        
        int left = 0, right = nums.length - 1;
        if(nums[pivot] <= target && target <= nums[right]) 
            left = pivot;
        else 
            right = pivot;
        
        while(left <= right) {
            int middle = left + (right - left)/2;
            if(nums[middle] > target)
                right = middle - 1;
            else if(nums[middle] < target) 
                left = middle + 1;
            else
                return middle;
        }
        
        return -1;
    }
}