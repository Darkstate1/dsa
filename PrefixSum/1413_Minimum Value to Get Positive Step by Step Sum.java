class Solution {
    public int minStartValue(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int min=Arrays.stream(prefix).min().getAsInt();
        if(min>=0){
            return 1;
        }
        return Math.abs(min)+1;
    }
}
