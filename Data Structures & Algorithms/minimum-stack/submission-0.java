class MinStack {
private Stack<Integer> stack;
private Stack<Integer> minstack;
    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || val<=minstack.peek())
        minstack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty()){
         int removed=stack.pop();
        if(removed==minstack.peek()){
           minstack.pop();
        }
        }
    }
    
    public int top() {
         if(!stack.isEmpty()){
            return stack.peek();
         }
         throw new EmptyStackException();
    }
    
    public int getMin() {
        if(!minstack.isEmpty())
          return minstack.peek();
        throw new EmptyStackException();
    }
}
