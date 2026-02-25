// Last updated: 2/25/2026, 9:09:40 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length;i+=2){
            k+=Math.min(nums[i],nums[i+1]);
        }
        return k;
    }
}