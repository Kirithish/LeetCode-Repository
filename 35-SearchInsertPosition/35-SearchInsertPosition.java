// Last updated: 6/29/2026, 9:19:58 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int end=nums.length-1;
4        int start=0;
5
6        while(end>=start){
7            int mid=start+(end-start)/2;
8            if(nums[mid]==target) return mid;
9            else if(nums[mid]>target) end=mid-1;
10            else start=mid+1;
11        }
12
13        return start;
14
15    }
16}