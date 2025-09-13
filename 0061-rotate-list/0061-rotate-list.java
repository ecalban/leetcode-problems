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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode last = head;
        int size = 1;
        while(last.next != null){
            last = last.next;
            size++;
        }
        int p = k % size;
        if(p == 0){
            return head;
        }
        ListNode newLast = head;
        for(int i = 0; i < size - p - 1; i++){
            newLast = newLast.next;
        }
        ListNode newHead = newLast.next;
        newLast.next = null;
        last.next = head;   
        return newHead;
       
    }
}