# Last updated: 2/25/2026, 9:09:54 AM
class Solution(object):
    def missingNumber(self, nums):
       n=len(nums)
       s=(n*(n+1))/2
       c=sum(nums)
       a=s-c
       return a
