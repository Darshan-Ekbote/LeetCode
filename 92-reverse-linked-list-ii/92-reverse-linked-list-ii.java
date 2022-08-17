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
  public ListNode reverseBetween(ListNode head, int left, int right) {
    
 //corner cases 
    if (head == null || head.next == null || left == right ){
        return head;
    }
	
    ListNode temp =  new ListNode ();
    temp.next = head;
    ListNode pre = temp;
    ListNode current = head;

    for (int i = 0; i < left - 1; i++)
    {
        pre = pre.next;
        current = current.next;
    }
	
    for (int i = 0; i < right - left ; i++)
    {
        ListNode Next = current.next;
        current.next = Next.next;
        Next.next = pre.next;
        pre.next = Next;
        
    }
   return temp.next;
}
}