// Last updated: 10/5/2026, 10:08:58 AM
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            else{
                set.add(nums[i]);
            }

        }
        return 1;
    }
}