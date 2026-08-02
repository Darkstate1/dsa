class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){//if the length is not equal we can directly say that its not gonna rotate
            return false;
        }
        return (s + s ).contains(goal);
    }
}
