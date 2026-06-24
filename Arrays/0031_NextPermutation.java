class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for (int i = nums.length - 2; i >= 0; i--) {//we didnt take nums.length-1 because it may go out of bounds
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot != -1) {
            for (int j = nums.length - 1; j > pivot; j--) {
                if (nums[j] > nums[pivot]) {
                    int temp = nums[pivot];
                    nums[pivot] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        int left = pivot + 1;//using two pointers to swap 
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
//we first find the pivot element to do that we go left from the end of the array until
//nums[i]<nums[i+1] after finding the pivot element we gotta traverse the right side of the pivot until we find an element greater than pivot
//to do this we just start from the end (we dont have to find the min element greater than pivot because its gonna be that by default)
//after finding that element swap with pivot and reverse the right side of pivot by using two pointers
