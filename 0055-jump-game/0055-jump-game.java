class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int a = 0;
        for(int i =0;i<n;i++){
            if(i>a){
                return false;
            }
            else{
                a = Math.max(a, i+nums[i]);
            }
        }
        return true;
    }
}