# Last updated: 2/25/2026, 9:10:23 AM
class Solution(object):
    def findPeakElement(self, nums):
        n=max(nums)
        for i in range(len(nums)):
            if nums[i]==n:
                return i