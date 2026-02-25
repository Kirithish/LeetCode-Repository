# Last updated: 2/25/2026, 9:10:58 AM
class Solution(object):
    def twoSum(self, nums, target):
        c=0
        for i in range(0,len(nums)-1):
            for j in range(i+1,len(nums)):
                c=nums[i]+nums[j]
                if c==target:
                    return i,j