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
    
   /* [[1,2],[2,3],[3,4]] -> [[1,2],[2,3]] , [[3,4]]
                        -> [1,2],[2,3] ,[3,4]
                        
                        merge-->
                        ->  [[[1,2,2,3]]], [[3,4]]
                        -> [1,2,2,3,3,4] -> final result 
        */
    
    public ListNode mergeKLists(ListNode[] lists) { // time -> O (N * logk)  & Space complexity - > O (k)
                                                    // k -> number of lists  , n_ number of nodes in list
        if(lists == null || lists.length==0)  return null;
        return divideAndConquer(lists,0,lists.length-1);
        
    }
    
    public ListNode divideAndConquer(ListNode[] lists, int left, int right){
        //if there is only one list
        if(left==right) return lists[left];
        int mid =left + (right-left)  /2; // l=20000 , r =22000 -> integer overflow
        ListNode l = divideAndConquer(lists, left, mid);
        ListNode r = divideAndConquer(lists, mid+1, right);
        //merge left list and right list here
        return merge(l,r);
    }
    
    //merge into sorted lists
    public ListNode merge(ListNode l, ListNode r){
        
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        
        while(l!=null || r!=null){
            if(l==null){
                curr.next = r;
                r= r.next;
            }else if(r==null){
                curr.next= l;
                l = l.next;
            }else if(l.val<r.val){
                curr.next = l;
                l=l.next;
            }else{
                curr.next = r;
                r = r.next;
            }
            curr = curr.next;
        }
        return result.next;
    }
}