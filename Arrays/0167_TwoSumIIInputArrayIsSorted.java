import java.util.*;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            if (sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{}; //this is like saying to return empty array if there is no solution because not every code path returns a value
        
    }
}

//two pointer approach 
//we first initialize left and right and move left and right based on if we find the req value or not 