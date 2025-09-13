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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 1;
        while(temp.next!=null){
            temp = temp.next;
            size++;
        }
        int position = size - n;
        if(position == 0){
            head = head.next;
            return head;
        }
        ListNode temp2 = head;
        for(int i = 0; i < position - 1;i++){
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}