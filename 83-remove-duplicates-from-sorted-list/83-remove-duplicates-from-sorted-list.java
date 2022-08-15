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
        
        ListNode ref =head;
        //ListNode returnList= ref;
        
        while(ref!=null && ref.next!=null){
            //found duplicate
            if(ref.val == ref.next.val){
               ref.next = ref.next.next;
            }else{
                ref=ref.next;
            }
        }
        
        return head;
    }
}