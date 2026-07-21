class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] count = new int[26];//create an array to store all 26 alphabets if they are in s or t 

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int x:count){
            if(x!=0){
                return false;
            }
        }
        return true;

    }
}

//this method is called as count frequency 
//what we do here is we count the frequency of the alphabets by doing s.charAt(i)-'a'
//lets say charAt(i) here is b ascii value of a is 97 b is 98 so it will add count as 1 and if t also contains b then it will -1
