/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode a = new ListNode(); a= headA;
        ListNode b = new ListNode(); b= headB;
        int lenA =0,lenB=0;
        
        while(a!=null) {
            a=a.next;
            lenA++;
        }
        
        while(b!=null) {
            b=b.next;
            lenB++;
        }
        
        int diff = Math.abs(lenA-lenB);
        b= headB;
        a= headA;
        ListNode rel ;
        
        if(lenB>lenA) {
            
            rel=headB;
            while(diff>0){
              rel = rel.next; diff--;
            }
            while(rel!=a&& a!=null && rel!=null){
                rel=rel.next; a=a.next;
            }
            return a;
        
        }else {
            
            rel=headA;
            while(diff>0){
                 rel = rel.next; diff--;
            }
            while(rel!=b && b!=null && rel!=null){
                rel=rel.next; b=b.next;
            }
            return b;
        }
    }
}