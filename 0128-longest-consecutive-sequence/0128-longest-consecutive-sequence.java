class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        List<Integer> arrayList = new ArrayList<>();
        for (int num : nums) {
            arrayList.add(num);
        }
        Collections.sort(arrayList);
        int count=1;
        int max=0;
        for(int i=0;i<arrayList.size()-1;i++){
            if(arrayList.get(i+1)-arrayList.get(i)==1){
                count+=1;
            }
            else if( arrayList.get(i+1)-arrayList.get(i)==0){
            	continue;
            }
            else{
                max=Math.max(max,count);
                count=1;
            }
        }
        
        return  max=Math.max(max,count);
        
    }
}