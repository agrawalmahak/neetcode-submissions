class Solution {
    public int longestConsecutive(int[] nums) {
      if(nums.length==0)
		return 0;
      if(nums.length==1)
      return 1;
	Arrays.sort(nums);
	int maxLen=0;
	int cnt=1;
	for(int i=0;i<nums.length-1;i++)
	{
	
		 if(nums[i+1]-nums[i]==1)
			cnt++;
		else if(nums[i]!=nums[i+1]){
			cnt=1;
		}
		maxLen=Math.max(maxLen, cnt);
	}
        
	return maxLen;  
    }
}
