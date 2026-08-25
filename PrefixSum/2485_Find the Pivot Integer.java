class Solution {
    public int pivotInteger(int n) {
        int totalsum=0;
        for(int i=0;i<=n;i++){
            totalsum+=i;
        }
        int leftsum=0;
        for(int x=1;x<=n;x++){
            leftsum+=x;
            int rightsum=totalsum-(leftsum-x);
            if(leftsum==rightsum){
                return x;
            }
        }
        return -1;


    }
}