class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
		int opt=0;
		for(String s:tokens)
		{
			if(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-"))
			{
				if(!st.isEmpty())
				{
					int val1=Integer.parseInt(st.pop());
					int val2=Integer.parseInt(st.pop());
					if(s.equals("*"))
					{
						opt=val1*val2;
					}
					else if(s.equals("/"))
					{
						opt=val2/val1;
					}
					else if(s.equals("+"))
					{
						opt=val1+val2;
					}
					else
					{
						opt=val2-val1;
					}
				}
				st.push(String.valueOf(opt));
			}
			else {
				st.push(s);
			}
		}
       return Integer.parseInt(st.pop());
    }
}
