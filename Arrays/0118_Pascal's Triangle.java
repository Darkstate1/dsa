import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //first gotta create an array list to store all the triangles 
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();//list to store all the rows
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));//here the i-1 refers to the previous row and j-1 refers to the element in the row
                }
            }
            triangle.add(row);

        }
        return triangle;
        
    }
}