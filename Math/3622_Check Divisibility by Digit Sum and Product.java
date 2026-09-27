class Solution {
    public boolean checkDivisibility(int n) {
        String str=String.valueOf(n);
        int sum=0;
        int product=1;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int digit=c-'0';
            sum+=digit;
            product*=digit;
        }
        if(n%(sum+product))==0{
            return true;
        }
        return false;
        
    }
}