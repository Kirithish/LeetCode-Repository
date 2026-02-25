# Last updated: 2/25/2026, 9:10:32 AM
class Solution(object):
    def subsets(self, nums):
        res = [[]]
        for num in nums:
            res += [curr + [num] for curr in res]
        return res
