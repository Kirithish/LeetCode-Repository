# Last updated: 2/25/2026, 9:10:24 AM
class Solution(object):
    def singleNumber(self, nums):
        for i in nums:
            c=nums.count(i)
            if c==1:
                return i
            
        