class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right= (long)Math.sqrt(c);//we are converting c to long first so that we dont face any issues since the tc is upto 2 to the power 32
        while(left<=right){
            long sum= left*left+right*right;
            if(sum==c){
                return true;
            }else if(sum<c){
                left++;
            }else{
                right--;
            }
        }
        return false;
        
    }
}