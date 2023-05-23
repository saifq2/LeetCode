class Solution {
    public int trap(int[] height) {
        int[] lMax=new int[height.length];
        int[] rMax=new int[height.length];;
        int res=0;
        lMax[0]=height[0];
        rMax[height.length-1]=height[height.length-1];
        for(int i=0;i<height.length-1;i++){
            lMax[i+1]=Math.max(lMax[i],height[i+1]);
        }
        for(int i=height.length-1;i>0;i--){
            rMax[i-1]=Math.max(height[i-1],rMax[i]);
        }
        for(int i=0;i<height.length;i++){
            res=res+Math.min(lMax[i],rMax[i])-height[i];
        }
        return res;
        
    }
}