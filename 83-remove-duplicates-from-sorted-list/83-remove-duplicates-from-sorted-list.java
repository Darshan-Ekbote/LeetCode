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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode ref =dummy.next;
        //ListNode returnList= ref;
        
        while(ref!=null && ref.next!=null){
            //found duplicate
            if(ref.val == ref.next.val){
               ref.next = ref.next.next;
            }else{
                ref=ref.next;
            }
        }
        
        return dummy.next;
    }
}