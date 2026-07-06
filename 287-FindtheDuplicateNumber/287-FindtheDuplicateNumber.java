// Last updated: 7/6/2026, 11:52:41 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        
5        for(int i=0;i<nums.length;i++){
6            if(set.contains(nums[i])){
7                return nums[i];
8            }
9            else{
10                set.add(nums[i]);
11            }
12
13        }
14        return 1;
15    }
16}