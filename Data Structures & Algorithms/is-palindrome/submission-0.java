class Solution {
    public boolean isPalindrome(String s) {
        String s1= s.replaceAll("[^a-zA-Z0-9]", "");
		 char[] reverse=new char[s1.length()];
		 int j=0;
		 for(int i=s1.length()-1;i>=0;i--)
		 {
			 char ch=s1.charAt(i);
			 reverse[j]=ch;
			 j++;
			 
		 }
		 String reversed=new String(reverse);
		 if(s1.equalsIgnoreCase(reversed))
	        return true;
		 return false;
    }
}
