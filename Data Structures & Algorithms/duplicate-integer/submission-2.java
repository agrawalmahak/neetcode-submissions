class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer, Integer> mp=new HashMap<>();
	for(int n:nums)
	{
		if(mp.containsKey(n))
			return true;
		else {
			mp.put(n, 1);
		}
			
	}
	return false;
    }
}