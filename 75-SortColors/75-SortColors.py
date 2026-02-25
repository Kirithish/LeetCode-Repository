# Last updated: 2/25/2026, 9:10:33 AM
class Solution(object):
    def sortColors(self, nums):
        if len(nums)<1:
            return nums
        pivot=nums[len(nums)//2]
        left=[x for x in nums if x<pivot]
        middle=[x for x in nums if x==pivot]
        right=[x for x in nums if x>pivot]
        c=self.sortColors(left)+middle+self.sortColors(right)
        for i in range(len(nums)):
            nums[i]=c[i]
        return nums

