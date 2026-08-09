class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int total=0;
        for(int i=0:nums){
            total+=i;
        }
        int leftsum=0;
        for(int x=0;x<nums.length-1;x++){
            leftsum+=nums[x];
            int rightsum=(total-leftsum);
            if((leftsum-rightsum)%2==0){
                count+=1;
            }

        }
        return count;
        
    }
}