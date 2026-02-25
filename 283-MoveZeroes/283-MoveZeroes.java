// Last updated: 2/25/2026, 9:09:47 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        //for filling up the remaining with zero after sorting
        for(int i=k;i<nums.length;i++){
            nums[i]=0;
        }
    }
}