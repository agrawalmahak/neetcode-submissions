class MinStack {

   private Stack<Integer> st;
	private Stack<Integer> minStack;
	
    public MinStack() {
       st=new Stack<>();
       minStack=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val)
        {
        	
        		minStack.push(val);
        
        }
    }
    
    public void pop() {
        int top=st.pop();
        
       if(!minStack.isEmpty() && top== minStack.peek())  
        minStack.pop();
    }
    
    public int top() {
      return st.peek();
    }
    
    public int getMin() {
     if(!minStack.isEmpty())
       return minStack.peek();
    	return 0;
    }
}
