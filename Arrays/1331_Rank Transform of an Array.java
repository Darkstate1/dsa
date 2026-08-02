import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

}
}