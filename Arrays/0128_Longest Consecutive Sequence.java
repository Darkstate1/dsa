import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();//hashset gets rid of duplicates reducing the size of array
        int max=0;
        if(nums.length==0){//null case
            return 0;
        }
        for(int num:nums){//add elements to hashset
            set.add(num);
        }
        for(int num:set){//loop through hashset
            if(!set.contains(num-1)){//if the no dosent have a preceding one then thats the first no 
                int current=num;
                int length=1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                max=Math.max(max,length);//we want the max size not the first one 
            }


        }
        return max;
        
    }
}