# Last updated: 2/25/2026, 9:10:39 AM
class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        results = []
        
        # A boolean array to track which numbers have been used in the current permutation.
        used = [False] * len(nums)
        
        def helper(current_permutation):
            # Base case: if the current permutation has the same number of elements
            # as the original list, it's a complete permutation.
            if len(current_permutation) == len(nums):
                results.append(list(current_permutation))
                return
            
            # Recursive step: iterate through the original numbers.
            for i in range(len(nums)):
                # If the number has not been used yet...
                if not used[i]:
                    # 'Choose': Mark it as used and add it to the current permutation.
                    used[i] = True
                    current_permutation.append(nums[i])
                    
                    # Recurse to find the rest of the permutation.
                    helper(current_permutation)
                    
                    # 'Un-choose' (Backtrack): Remove the number and mark it as unused
                    # to explore other possibilities.
                    current_permutation.pop()
                    used[i] = False
        
        # Start the backtracking process with an empty permutation.
        helper([])
        return results