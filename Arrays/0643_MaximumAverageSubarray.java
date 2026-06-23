class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            //creating a first window 

        }
        int maxsum=sum;
        for(int i=k;i<nums.length;i++){ //creating the second window 
            sum-=nums[i-k];
            sum+=nums[i];
            maxsum=Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}

//we use sliding window technique here 