class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            int left = 0;
            if (j > 0) {
            left = prefix[j - 1];
    }

    int right = prefix[nums.length - 1] - prefix[j];
    if (left == right) {
        return j;
    }
}
        return -1;

    }
}