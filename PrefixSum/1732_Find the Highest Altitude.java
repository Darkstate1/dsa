class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix=new int[gain.length+1];//we need to create a separate array to store our prefix sum 
        prefix[0]=0;
        for (int i = 1; i < prefix.length; i++) {
        prefix[i] = prefix[i - 1] + gain[i - 1];
        }
        int max=0;
        for(int num:prefix){
            if(num>max){
                max=num;
            }
        }
        return max;
        
    }
}