// Last updated: 6/10/2026, 7:49:25 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        for(int i=0;i<nums.length;i++){
4            for(int j=0;j<nums.length;j++){
5                if(j!=i){
6                    if(nums[i]+nums[j]==target){
7                        return new int[]{i,j};
8                    }
9                }
10            }
11        }
12        return new int[]{-1,-1};
13        
14    }
15}