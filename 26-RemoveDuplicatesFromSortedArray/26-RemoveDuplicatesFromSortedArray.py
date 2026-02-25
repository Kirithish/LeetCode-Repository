# Last updated: 2/25/2026, 9:10:51 AM
class Solution(object):
    def removeDuplicates(self, nums):
        duplicates = []
        c=0
        for i in range(0,len(nums)):
            if nums[i] not in duplicates:
                nums[c]=nums[i]
                c+=1  
                duplicates.append(nums[i])      
        return c