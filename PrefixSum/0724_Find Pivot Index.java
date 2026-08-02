class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
            }
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int rightsum=totalSum-leftsum-current;
            if(leftsum== rightsum){
                return i;
            }
            leftsum+=current;
        }
        return -1;
        
    }
}