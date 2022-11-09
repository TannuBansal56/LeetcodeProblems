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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head;
         if(head == null ){
            return null;
        }
        ListNode curr = head.next;
       
        while(curr!=null){
            if(curr.val == val){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = prev.next ;
                curr = curr.next;
            }
        }
        
        if(head.val ==val){
            return head.next;
        }
        else 
        {
            return head;
        }
        
    }
}