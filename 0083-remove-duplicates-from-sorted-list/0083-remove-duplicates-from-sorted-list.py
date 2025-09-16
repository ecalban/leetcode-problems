# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if not head:
            return None

        r = head
        tempL = head
        tempR = head.next
        while(tempL.next != None):
            if tempL.val == tempR.val:
                tempL.next = tempR.next
                tempR = tempR.next
            else:
                tempL = tempR
                tempR = tempR.next

        return r
