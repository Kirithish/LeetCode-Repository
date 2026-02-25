# Last updated: 2/25/2026, 9:10:01 AM
class Solution(object):
    def findKthLargest(self, nums, k):
        nums.sort()
        return nums[-k]