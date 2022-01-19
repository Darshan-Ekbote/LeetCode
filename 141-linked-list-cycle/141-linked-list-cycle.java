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
        
        Set<ListNode> visited = new HashSet<>();
        ListNode node = head;
        while(node!=null){
            
            if(visited.contains(node))
                return true;
            visited.add(node);
            node=node.next;
        }
        
        return false;
    }
}