// Last updated: 2/25/2026, 9:10:57 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        }
            return new int[]{-1,-1};
        
    }
}