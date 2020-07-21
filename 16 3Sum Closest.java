class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int answer = 0x3f3f3f3f;
        
        for(int i=0; i<nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) 
                continue;
            
            int current = nums[i];
            int left = i+1;
            int right = nums.length-1;          
            
            while(left < right) {
                int sum = current + nums[left] + nums[right];
                if(Math.abs(sum - target) < Math.abs(answer - target))
                    answer = sum;
                if(sum == target)
                    return answer;               
                else if(sum < target)
                    left++;
                else    
                    right--;
            }
        }
        return answer;
    }
}