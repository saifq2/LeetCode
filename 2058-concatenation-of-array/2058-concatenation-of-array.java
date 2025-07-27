class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
            for(int j=0;j<nums.length;j++){
                ans[j]=nums[j];
                ans[nums.length+j]= nums[j];
            }
        
        return ans;
    }
}