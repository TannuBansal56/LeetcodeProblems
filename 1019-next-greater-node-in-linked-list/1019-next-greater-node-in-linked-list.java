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
    public int[] nextLargerNodes(ListNode head) {
        int arr1[] = arrayNodes(head);
        int arr2[] = new int [arr1.length];
        int max = 0;
        int i =0;
        for(; i<arr1.length-1;i++){
            
            max = arr1[i];
            for(int j = i+1; j<arr1.length;j++){
                if(max<arr1[j]){
                    max = arr1[j];
                    break;
                }
                
            }
            if(max!=arr1[i]){
                arr2[i]=max;
            }
            else{arr2[i] = 0;}
        }
        arr2[arr2.length-1] = 0;
        return arr2;
    }
    
    public int[] arrayNodes(ListNode head){
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
         length = length + 1;   
        temp = temp.next;
            }
        
        int arr[] = new int[length];
        int i =0 ;
        temp = head;
        while(temp!=null){
            arr[i] = temp.val;
            temp = temp.next;
            i++;
            }
        return arr;
    }
}