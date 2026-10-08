class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length<=1)
        return 0;
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int l=0;
        int r=l+k-1;
        while( r<nums.length)
        {
           int diff=nums[r]-nums[l];
           minDiff=Math.min(minDiff, diff);
           l++;
           r=l+k-1;
        }
        return minDiff;
    }
}