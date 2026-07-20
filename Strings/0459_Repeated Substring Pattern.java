class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String Doubled= s+s;//first double the string
        return Doubled.substring(1,Doubled.length()-1).contains(s); //after doubling the string get rid of the first 
        //and last letter so that it dosent always show true and then check if s exists in it 

        
    }
}