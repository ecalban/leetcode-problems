class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        expectedSum = 0
        for i in range(len(nums) + 1):
            expectedSum +=i

        realSum = 0
        for i in nums:
            realSum +=i

        return expectedSum - realSum
        