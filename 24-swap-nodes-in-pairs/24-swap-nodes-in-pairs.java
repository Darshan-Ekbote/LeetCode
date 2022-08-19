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
    public ListNode swapPairs(ListNode head) {
        
        //base conditions
        if(head == null || head.next==null)
            return head;;

        // 1 -> 2->3 -> 4
        // f    s
        // 2 -> 1 ->3 ->4
        // 2 ->1 -> 4 ->3
        //          f   s
        
        ListNode first = head;
        ListNode second = head.next;
        
        first.next = swapPairs(second.next);
        second.next = first;
        
        
        return second;
    }
}