class Solution {
    public int removeElement(int[] nums, int val) {
        int current = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
               end++;
               continue;
            }
            else{
                nums[current] = nums[end];
                current++;
                end++;
            }
        }
        return current;
        
    }
}