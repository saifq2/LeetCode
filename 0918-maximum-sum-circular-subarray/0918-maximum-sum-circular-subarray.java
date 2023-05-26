class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int kadaneResult=maxSubArrayKadane(nums);
        if(kadaneResult<0){
            return kadaneResult;
        }
		int circularResult=maxCircularSubArray(nums); 
        return Math.max(kadaneResult,circularResult);
    }
    public static int maxSubArrayKadane(int[] arr){
		int maxEnding=arr[0];
		int res=arr[0];
		for(int i=1;i<arr.length;i++){
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			res=Math.max(res,maxEnding);
		}
		return res;
	}
	public static int maxCircularSubArray(int[] arr){
		int minEnding=0;
		int res=arr[0];
		int allSum=0;
		for(int i=0;i<arr.length;i++){
			minEnding=Math.min(minEnding+arr[i],arr[i]);
			res=Math.min(minEnding,res);
		}
		for(int i:arr){
			allSum+=i;
		}
		return allSum-res;
	}
}