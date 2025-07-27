class Solution {
    public int removeDuplicates(int[] nums) {
        int currrent =0;
        int end = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[end]){
                end++;
                continue;
            }
            else{
                currrent++;
                nums[currrent] = nums[end];
                end++;
            }
        }
        return currrent+1;
    }

}