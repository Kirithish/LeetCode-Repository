// Last updated: 9/28/2026, 12:01:54 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int current=nums[0];
4        int global=nums[0];
5        int n=nums.length;
6        for(int i=1;i<n;i++){
7            current=Math.max(nums[i], current+nums[i]);
8            global=Math.max(current, global);
9        }
10
11        return global;
12    }
13}