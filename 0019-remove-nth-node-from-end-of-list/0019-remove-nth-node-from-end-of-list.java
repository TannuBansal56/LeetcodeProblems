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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head;
        int listLength = 0;
        if(head==null || head.next==null){
            return null;
        }
    
          
    
        while(prev!=null){
            listLength = listLength + 1;
            prev = prev.next;
        }
        if(listLength-n == 0){
            head = head.next;
            return head;
        }
        prev = head;
        for(int i =1; i<listLength-n; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}