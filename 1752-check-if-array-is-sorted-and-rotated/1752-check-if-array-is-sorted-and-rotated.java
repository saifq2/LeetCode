class Solution {
    public int[] reverse(int arr[],int start,int end){
        int temp=0;
       while(start<end){
           temp=arr[end];
           arr[end]=arr[start];
           arr[start]=temp;
           start++;
           end--;
       }
        return arr;
    }
    public boolean check(int[] nums) {
        int maxIndex=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                maxIndex=i+1;
                break;
            }
        }
        reverse(nums,0,maxIndex-1);
        reverse(nums,maxIndex,nums.length-1);
        reverse(nums,0,nums.length-1);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
        
    }
}