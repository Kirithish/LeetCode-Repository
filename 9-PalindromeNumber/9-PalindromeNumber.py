# Last updated: 2/25/2026, 9:10:53 AM
class Solution:
    def isPalindrome(self, x):
        original = x
        rev = 0
        while x > 0:
            digit = x % 10
            rev = rev * 10 + digit
            x = x // 10
        return rev == original

        