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
    
//         this is how you reverse a LinkedList (above and below)
        while(current != null) { 
            ListNode next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
        
//         prev is now set the current, which is why this logic works, although it doesn't make sense. It's not really prev anymore but because we reversed it thats why we have to use this name
        while(prev != null) {
            n += prev.val * Math.pow(2, exponent);
            prev = prev.next;
            exponent++;
        }
        
        return n;
    }
}