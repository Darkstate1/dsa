class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();//get rid of the trailing spaces ex "hello world   "gets rid of this space
        int lastspace = s.lastIndexOf(' ');//find the last spacebar 
        String lastword = s.substring(lastspace+1);//the string after the last space 
        return lastword.length();

        
    }
}