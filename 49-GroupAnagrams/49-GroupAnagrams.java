// Last updated: 6/10/2026, 8:21:30 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            set.add(nums[i]);
6        }
7        return set.size()!=nums.length;
8    }
9}