class Solution {
    public static int evalRPN(String[] tokens) {
    Stack<Integer> stack=new Stack<>();
    for(String st:tokens){
        if(st.equals("+")||st.equals("-")||st.equals("*")||st.equals("/")){
          int b=stack.pop();
          int a=stack.pop();
          
          switch(st){
            case "+" :stack.push(a+b); break;
            case "-" :stack.push(a-b); break;
            case "*" :stack.push(a*b); break;
            case "/" :stack.push(a/b); break;
          }
        }
        else{
            stack.push(Integer.parseInt(st));
        }
    }
    return stack.pop();
}
}






















/*        Stack<Integer> stack=new Stack<>();
        int res=0;
        for(int i=0;i<tokens.length;i++){
            if(!(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")|| tokens[i].equals("/")))
              stack.push(Integer.parseInt(tokens[i]));
            else{
                if(tokens[i]=="+")
                  {while(!stack.isEmpty())
                  {
                    res+=stack.pop();
                  } 
                  }
                else if(tokens[i]=="-"){
                  while(!stack.isEmpty())
                  {
                    res-=stack.pop();
                  } 
                }  
                else if(tokens[i]=="*"){
                  while(!stack.isEmpty())
                  {
                    res*=stack.pop();
                  } 
                }
                else{
                  while(!stack.isEmpty())
                  {
                    res/=stack.pop();
                  } 
                  }
            }
        }
        return res;
    }*/