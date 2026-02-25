# Last updated: 2/25/2026, 9:10:21 AM
class Solution(object):
    def maximumGap(self, nums):
        nums.sort()
        p=0
        for i in range(1,len(nums)):
            k=max(nums[i],nums[i-1])
            q=min(nums[i],nums[i-1])
            c=k-q
            if c>p:
                p=c
        return p