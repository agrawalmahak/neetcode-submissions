class Solution {
    public boolean isAnagram(String s, String t) {
char[] sArray=s.toCharArray();
		Arrays.sort(sArray);
		String s1=new String(sArray);
		System.out.println(s1);
		char[] tArray=t.toCharArray();
		Arrays.sort(tArray);
		String t1=new String(tArray);
		System.out.println(t1);
		
		if(s1.equals(t1))
			return true;
return false;
    }
}
