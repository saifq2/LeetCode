class Solution {
    public int majorityElement(int[] nums) {
        int count =1;
        int res=0;
        for(int i=0;i<nums.length;i++ ){
            if(nums[i]==nums[res]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        int result=0;
        for(int i:nums){
            if(nums[res]==i){
                result++;
            }
        }
        if(result>nums.length/2){
            return nums[res];
        }
        return -1;
        
    }
}