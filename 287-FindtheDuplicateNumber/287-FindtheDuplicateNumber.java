// Last updated: 7/6/2026, 11:53:50 AM
class Solution {
    public int findDuplicate(int[] nums) {
        
         int[] freq = new int[nums.length];
        for (int num : nums) {
            freq[num]++;

            if (freq[num] > 1) {
                return num;
            }
        }
        return -1;
        
    }
}