class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
		int maxEnding=0;
		for(int i:nums){
			maxEnding=Math.max(maxEnding+i,i);
			res=Math.max(maxEnding,res);
		}
        return res;
        
    }
}