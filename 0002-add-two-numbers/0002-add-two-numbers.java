/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode newList = new ListNode(0);
    public ListNode head = newList;
    public int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val + carry;
        carry = sum / 10;
        sum %=10;
        newList.next = new ListNode(sum);
        newList = newList.next;
        if(l1.next!=null && l2.next!=null){
            // iki düğümünde sonrakisi var
            return addTwoNumbers(l1.next, l2.next);
        }
        else if (l1.next!=null && l2.next==null){
            // l1 sonrakisi var l2 yok
            l2.next = new ListNode(0);
            return addTwoNumbers(l1.next, l2.next);
        }
        else if (l1.next==null && l2.next!=null){
            // l1 sonrakisi yok l2 var
            l1.next = new ListNode(0);
            return addTwoNumbers(l1.next, l2.next);
        }
        // ikisininde devamı yok
        if(carry==1){
            newList.next = new ListNode(carry);
            newList = newList.next;
        }
        return head.next;
    }
}