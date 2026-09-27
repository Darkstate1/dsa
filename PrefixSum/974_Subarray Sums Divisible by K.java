import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int currentSum=0;
        int count=0;
        for(int num:nums){
            currentSum+=num;
            int needed = ((currentSum % k) + k) % k;            
            if(map.containsKey(needed)){
                count+=map.get(needed);
            }
        map.put(needed, map.getOrDefault(needed, 0) + 1);
        }
        return count;
        
    }
}