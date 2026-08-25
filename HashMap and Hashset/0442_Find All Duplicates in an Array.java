import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();// Stores each number as the key and its frequency as the value.
        List<Integer> ans=new ArrayList<>();//creating a seperate list to store the repeating values
        for(int num:nums){//iterating through the array
        map.put(num,map.getOrDefault(num,0)+1);//adding all elements to the hashmap getordefault is used for the count
      } 
      for(int key:map.keySet()){//loop through the keys
        if(map.get(key)==2){//if the values is equal to 2 then add it to final list
            ans.add(key);
        }
      }
      return ans;
    }
}