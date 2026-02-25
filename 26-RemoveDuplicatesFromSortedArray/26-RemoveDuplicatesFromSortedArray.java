// Last updated: 2/25/2026, 9:10:46 AM
class Solution {
    public int removeDuplicates(int[] nums) {


        int n=nums.length;
        int[] p=new int[n];
        int k=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }

        

        return k;

    }
}