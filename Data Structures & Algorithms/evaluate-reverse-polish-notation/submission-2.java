class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(String value: tokens){
            int op1 = 0; 
            int op2 = 0;
            if(value.equals("+")){
                    op1 = stack.pop();
                    op2 = stack.pop();
                    result = op1 + op2;
                    stack.push(result);
                }else if(value.equals("-")){
                    op1 = stack.pop();
                    op2 = stack.pop();
                    result = op2 - op1;
                    stack.push(result);
                }else if(value.equals("*")){
                    op1 = stack.pop();
                    op2 = stack.pop();
                    result = op1 * op2;
                    stack.push(result);
                }else if(value.equals("/")){
                    op1 = stack.pop();
                    op2 = stack.pop();
                    result = op2 / op1;
                    stack.push(result);
                }
                else{
                stack.push(Integer.parseInt(value));
            }
            }

         return stack.pop();
        
        }
}

