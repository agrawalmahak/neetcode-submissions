class Solution {
    public int maxArea(int[] heights) {
       int l=0,r=heights.length-1;
		 int area;
		 int maxA=0;
		 while(l<r)
		 {
			 area=(r-l)*(Math.min(heights[l], heights[r]));
			 if(heights[l]<heights[r])
				 l++;
			 else
				 r--;
			 maxA=Math.max(area, maxA);
		 }
	        return maxA;
    }
}
