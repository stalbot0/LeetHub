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
    public int getDecimalValue(ListNode head) {
        ListNode prev = null;  
        ListNode current = head;
        int n = 0;
        int exponent = 0;
    
        while(current != null) { 
            ListNode next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
        
        while(prev.next != null) {
            n += prev.val * Math.pow(2, exponent);
            prev = prev.next;
            exponent++;
        }
        
        n += prev.val * Math.pow(2, exponent);
        
        return n;
    }
}