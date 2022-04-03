/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        Map<ListNode,ListNode> m = new HashMap<>();
        
        ListNode c = head;
        
        while( c!=null ){
            
            if(m.containsKey(c))
                return true;
            m.put(c,c);
            c=c.next;
            
          }
        
        return false;
    }
}