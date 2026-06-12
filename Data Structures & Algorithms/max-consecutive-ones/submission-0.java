class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int subcount = 0;
        int maxcount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                subcount++;
                if(i == nums.length-1 && nums[i] == 1 && subcount > maxcount)
                maxcount = subcount;
            }
            
            else if(nums[i] == 0)
            {
                if(subcount > maxcount)
                {
                    maxcount = subcount;
                }
                subcount = 0; 
            }
        }
        return maxcount;

        
    }
}