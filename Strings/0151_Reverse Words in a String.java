class Solution {
    public String reverseWords(String s) {
        String[] Words=s.split("\\s+");
        StringBuilder sb=new StringBuilder();

        for (int i = Words.length- 1; i >= 0; i--) {
            sb.append(Words[i]);
            if(i!=0){
            sb.append(" ");
            }
        }

        return sb.toString();
    }
}
    public static void main(String[] args) {
        Solution obj = new Solution();
        String result = obj.test("hello     my name is sreesanth");
        System.out.println(result);
    }
}