# Last updated: 2/25/2026, 9:10:49 AM
class Solution(object):
    def removeElement(self, nums, val):
        k = 0  # index for placing the next non-val element
        
        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1
        
        return k
