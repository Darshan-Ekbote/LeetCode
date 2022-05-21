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
        
        if (head == null || head.next == null || k==0) return head;
        ListNode refHead =new ListNode();
        refHead =head;
        ListNode oldEnd = head;
        int len =1;
        for(;oldEnd.next!=null;len++)
            oldEnd = oldEnd.next;
        
         oldEnd.next= head;
        
        ListNode newEnd = head;
        // 1 2 3   4 5 
        for( int i =0;i< len-(k%len)-1;i++)
            newEnd= newEnd.next;
        
        ListNode newHead = newEnd.next;
        
        newEnd.next=null;
        
        return  newHead;
        
        
        
    }
}