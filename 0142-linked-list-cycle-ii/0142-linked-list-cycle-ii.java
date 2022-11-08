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
    public ListNode detectCycle(ListNode head) {
       ListNode slow = head;
        
        if(slow==null|| slow.next ==null){
           return null; 
        }
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        if (slow==fast){
            if(head==slow){
                return slow;
            }
            else
            {
                ListNode p = head;
                while(p!=slow){
                    slow = slow.next;
                    p = p.next;
                }
                return slow;
            }
        }
            
        }
        return null;  
    }
}