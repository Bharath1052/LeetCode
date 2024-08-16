class Solution {
    public int search(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else{
                index=-1;
            }
        }return index;
    }
}