class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];
	
	int k=0;
	for(int i=0;i<temperatures.length-1;i++)
	{
		boolean found=false;
		int j=i+1;
		
		while(j<temperatures.length)
		{
			if(temperatures[i]<temperatures[j])
			{
				found=true;
				result[k]=j-i;
				k++;
				break;
			}
			j++;
		}
		if(!found)
			k++;
		
	}
        
	return result;
    }
}
