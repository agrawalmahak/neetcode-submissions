class Solution {

    public String encode(List<String> strs) {
		if(strs.isEmpty())
			return "";
		StringBuilder sb=new StringBuilder();
		for(String s:strs)
		{
			sb.append(s.length()).append('#').append(s);
		}
		return sb.toString();
    }

    public List<String> decode(String str) {
		
        List<String> result=new ArrayList<>();
    	
    	int i=0;
    	while(i<str.length())
    	{
    	int s=str.indexOf('#',i);
    	
    	int len=Integer.parseInt(str.substring(i, s));
    	int start=s+1;
    	int end=start+len;
    	result.add(str.substring(start,end));
		i=end;
    	}
    	
    	return result;
    }
}
