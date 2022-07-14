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
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        int count=0;
        ListNode p = head;
        
        //check if K nodes exists
        while(count<k&& p!=null){
            count++;
            p=p.next;
        }
        //1->2->3->4->5->6
        
        if(count==k){
            ListNode revHead = reverseList(head,k);
            // revHead = 3->2->1
            // head = 1
            // p = 4->5->6
            head.next = reverseKGroup(p,k);
            return revHead;
        }
        
        return head;
        
    }
    
    public ListNode reverseList(ListNode head, int k){
        
        ListNode revHead= null;
        ListNode curr = head;
        ListNode nextNode=head;
        
        while(k>0){
        
            nextNode = curr.next;
            curr.next = revHead;
            revHead = curr;
            curr = nextNode;
            k--;
        }
        
        return revHead;
    }
        
    
    
}