# Last updated: 2/25/2026, 9:10:41 AM
class Solution(object):
    def search(self, nums, target):
        n=len(nums)
        c=0
        for i in range(n):
             if nums[i]==target:
                 return i
                 c+=1
    
        if c==0:
            return -1
        