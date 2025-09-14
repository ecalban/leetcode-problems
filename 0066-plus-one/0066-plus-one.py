class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        if(digits == [9]):
            return [1,0]
        if(digits[-1] != 9):
            digits[-1] +=1
            return digits
        digits[-1] = 0
        digits[-2] +=1
        i = len(digits) - 2
        while(digits[i] == 10):
            if(i == 0):
                digits[i] = 0
                digits.insert(0, 1)
                
            else:
                digits[i] = 0
                digits[i-1] +=1
            i -=1
        return digits


        