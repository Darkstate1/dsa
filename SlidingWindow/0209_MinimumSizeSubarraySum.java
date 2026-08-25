class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;//automatically assigns a huge value to the variable
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                minLength=Math.min(minLength,right-left+1);//(right-left+1) is the length 
                sum-=nums[left];
                left++;
            }
        }
        if(minLength==Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
        
    }
}