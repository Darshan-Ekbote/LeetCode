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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null || head.next==null ) return head;
        int count=1;
       
        ListNode odd = new ListNode();
        ListNode ref = odd;
        ListNode even = new ListNode();
        ListNode refEven = even;
        
        //1->2->3->4->5 
        //o
        //x e
        while(head!=null){
            
            if(count%2==0){
                even.next= new ListNode(head.val);
                even = even.next;
            }
                
            else{
                odd.next= new ListNode(head.val);
                odd = odd.next;
            }
                
                
            head = head.next;
            count++;
        }
        
        if(odd!=null && refEven.next!=null){
             odd.next= refEven.next ;
            odd= odd.next;
        }
            
        
        return ref.next;
        
        
        
    }
}