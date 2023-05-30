class Solution {
    public int[] reverse(int[] arr,int start,int end){
        int temp=0;
        while(start<end){
            
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        
        }
        return arr;
    }
    public void rotate(int[] nums, int k) {
        int leftRotate=Math.abs(nums.length-k%nums.length);
        if(nums.length>1){
        reverse(nums,0,leftRotate-1);
        reverse(nums,leftRotate,nums.length-1);
        reverse(nums,0,nums.length-1);
        //return nums;
        }

        
    }
}