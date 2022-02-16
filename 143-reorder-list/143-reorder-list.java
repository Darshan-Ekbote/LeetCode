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
public class Solution {
    public void reorderList(ListNode head) {
        
        if (head==null||head.next==null) return;
        
        Deque <ListNode> stack = new ArrayDeque<>();
        ListNode node= head;
        while(node!=null){
            stack.push(node);
            node= node.next;
        }
        
        int mid = (stack.size()-1) /2;
        ListNode start= head;
        
        while(mid>0){
            // 1 -> 2 -> 3 > 4> 5
            ListNode temp = start.next;
            ListNode second = stack.pop();
            start.next=second;
            second.next= temp;
            start = temp;
            mid--;
        }
        
         stack.pop().next=null;
        
    }
}