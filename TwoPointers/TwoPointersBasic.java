public class TwoPointersBasic {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        int target=6;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                System.out.println("found indices: "+ nums[left]+" "+nums[right]);
                return;
            }
            if (sum<target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("no pairs found");
    }
    
}
