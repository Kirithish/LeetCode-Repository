// Last updated: 2/25/2026, 9:10:27 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int max = 1;
        int c = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue; // skip duplicates
            }
            else if (nums[i + 1] == nums[i] + 1) {
                c++;
            }
            else {
                c = 1;
            }
            max = Math.max(max, c);
        }
        return max;
    }
}
