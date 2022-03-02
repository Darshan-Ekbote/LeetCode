/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 Input: list1 = [1,2,4], list2 = [1,3]
Output: [1,1,2,3,4]
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
       ListNode newList = new ListNode(0);
        
       ListNode retrunThisList = newList;
        
        while( list1!=null && list2!=null){
            
            if( list1.val > list2.val){
                
                newList.next = list2;
                list2= list2.next;
                newList= newList.next;
            }
            else{
                
                newList.next = list1;
                list1 = list1.next;
                newList = newList.next;
            }
        }
        newList.next = list1==null?list2 : list1;
        
        return retrunThisList.next;
    }
}