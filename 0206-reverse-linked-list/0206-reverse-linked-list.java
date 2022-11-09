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
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next == null){
            return head;
        }
        else if( head.next.next ==null){
            ListNode prev = head;
            ListNode curr = head.next;
            curr.next = prev;
            prev.next = null;
            return curr;
        }
        else{
            ListNode prev = head;
            ListNode curr = head.next;
            prev.next =null;
            ListNode forw = curr.next;
            
            while(curr.next!=null){
                curr.next = prev;
                prev = curr;
                curr = forw;
                forw = forw.next;
            }
            curr.next = prev;
            return curr;
        }
    }
}