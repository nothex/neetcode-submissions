class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || minstack.peek()>=val) minstack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            int removed=stack.pop();
            if(!minstack.isEmpty() && minstack.peek() ==removed) minstack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()) return stack.peek();
        return -1;
    }
    
    public int getMin() {
        if(!minstack.isEmpty()) return minstack.peek();
        return -1;
    }
}
