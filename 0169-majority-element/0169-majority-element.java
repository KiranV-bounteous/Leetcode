class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int key=0;
    
        for(Map.Entry<Integer, Integer> entry : hs.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                key=entry.getKey();
            }
        }
        return key;
    }
}