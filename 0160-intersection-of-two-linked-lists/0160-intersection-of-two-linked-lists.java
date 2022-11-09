/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = lengthLinkedList(headA);
        int lenB = lengthLinkedList(headB);
        if(lenA > lenB){
             for(int i =1 ; i<= lenA-lenB; i++){
                 headA = headA.next;
             }
            lenA = lenB;
        }
         if(lenB > lenA){
             for(int i =1 ; i<= lenB-lenA; i++){
                 headB = headB.next;
             }
             
             lenB = lenA;
        }
        if(lenA == lenB){
            while(headA!=headB && headA!=null & headB!=null){
                headA = headA.next;
                headB = headB.next;
            }
            if(headA==headB && headA!=null && headB!=null){
                return headA;
            }
            return null;
            
        }
        
        return null;
        
        
        
    }
    public int lengthLinkedList(ListNode head){
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            length = length + 1;
            temp = temp.next;
            
        }
        return length;
    }
}