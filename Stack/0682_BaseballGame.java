import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int first=stack.pop();
                int second=stack.peek();
                stack.push(first);
                stack.push(first+second);
            }else if (op.equals("D")){
                stack.push(stack.peek()*2);//double when the op equals D
            }else if (op.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(op));//parseint belongs to the Integer class like math.sqrt()
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}