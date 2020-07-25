class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        return kSum(nums, 0, 4, target);
    }
    
    private List<List<Integer>> kSum(int[] nums, int start, int k, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(start == nums.length || nums[start] * k > target || nums[nums.length-1] * k < target)
            return result;
        
        if(k == 2)
            return twoSum(nums, target, start);
        
        for(int i=start; i<nums.length; ++i) {
            if(i == start || nums[i-1] != nums[i]) {
                for(var temp : kSum(nums, i+1, k-1, target-nums[i])) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i])));
                    result.get(result.size() - 1).addAll(temp);
                }
            }
        }
        
        return result;
    }
    
    private List<List<Integer>> twoSum(int[] nums, int target, int start) {
        List<List<Integer>> result = new ArrayList<>();
        int left = start;
        int right = nums.length-1;
        
        while(left < right) {
            int sum = nums[left] + nums[right];
            
            if(sum < target || (left > start && nums[left] == nums[left-1]))
                ++left;
            else if (sum > target || (right < nums.length-1 && nums[right] == nums[right+1]))
                ++right;
            else
                result.add(Arrays.asList(nums[left++], nums[right++]));
        }
        
        return result;
    }
}