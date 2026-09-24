class Solution {
    public int[] productExceptSelf(int[] nums) {
    int zero=0;
	int[] result=new int[nums.length];
	
	int product=1;
	for(int i=0;i<nums.length;i++ )
	{
		if(nums[i]!=0)
		{
			
			product*=nums[i];
		}
		else {
			zero++;
			
		}
	}
	
	for(int i=0;i<nums.length;i++)
	{
		if(zero>1)
		{
			result[i]=0;
		}
		else  if(zero>0)
		{
			if(nums[i]!=0)
			{
				result[i]=0;
			}
			else {
				result[i]=product;
			}
		}
		else {
		result[i]=product/nums[i];
		}
	}
	
        return result;
    }    
    
}  
