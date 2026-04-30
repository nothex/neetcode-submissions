class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String c:tokens){
            if(c.equals("+")) {
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a+b);
            }
            else if(c.equals("-")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a-b);
            }
            else if(c.equals("*")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a*b);
            }
            else if(c.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a/b);
            }
            if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/"))
            stack.push(Integer.parseInt(c));
        }
        return stack.peek();
    }
}
