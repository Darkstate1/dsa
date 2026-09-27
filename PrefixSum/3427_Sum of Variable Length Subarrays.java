class Solution {
    public int subarraySum(int[] nums) {
        int[] prefix=new int[nums.length];
        int sum=0;
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int j=0;j<prefix.length;j++){
            int start=Math.max(0,j-nums[j]);
            if(start==0){
                sum+=prefix[j];
            }else{
                sum+=prefix[j]-prefix[start-1];
            }
        }
        return sum;
        
    }
}