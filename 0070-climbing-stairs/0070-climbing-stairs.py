class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n<4:
            return n

        list = [0,1,2,3]

        for i in range(4, n+1):
            list.append(list[i-1] + list[i-2])
        return list[n]

        