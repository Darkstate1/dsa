class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            int width= right-left;
            int hei=Math.min(height[left], height[right]);//water wont go over the minimum height
            int area=width*hei;
            maxarea = Math.max(maxarea, area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxarea;

    }
}
//we use two pointer here because the array is sorted 
//the array is sorteddd so that means that the width will be the largest when we take left and right 
//so thats the reason we adjust the height only while sacrificing some width