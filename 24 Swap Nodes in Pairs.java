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
    public ListNode swapPairs(ListNode head) {
        if(head == null) 
            return head;
        if(head.next == null)
            return head;
        
        ListNode iterator = head.next;
        head.next = iterator.next;
        iterator.next = head;
        head = iterator;
        
        iterator = head.next;
        ListNode temp = null;
        
        while(iterator.next != null && iterator.next.next != null) {
            
            temp = iterator.next;
            iterator.next = temp.next;
            temp.next = temp.next.next;
            iterator.next.next = temp;
            
            iterator = iterator.next.next;
        }
        
        return head;
    }
}