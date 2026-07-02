import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){//to avoid duplicates initially 
                continue;
            }
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));//adding the list into the ans
                    left++;//if we dont do this the loop will be stuck 
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
            
        }
        return ans;
    }
}

//the main problem in this question is we gotta avoid duplicates