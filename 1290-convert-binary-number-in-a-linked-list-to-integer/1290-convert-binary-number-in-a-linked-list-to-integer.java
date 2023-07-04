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
        
//         now that the linkedlist is reversed, we can calculate the decimal value using the formula (googled formula)
        while(prev.next != null) {
            n += prev.val * Math.pow(2, exponent);
            prev = prev.next;
            exponent++;
        }
        
//         this is to get the last value in the linked list, because prev.next == null ends it before it does the logic inside of the while loop right before the null node
        n += prev.val * Math.pow(2, exponent);
        
        return n;
    }
}