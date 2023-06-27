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
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head; // both ListNodes point to the head
        
        // the next node must be a node and we can safely jump to the next node
        while(end != null && end.next != null) { // e.g. 3 1 2 7 7
            middle = middle.next; // middle node moves up 1 every step
            end = end.next.next; //end node moves up 2 every step
        }
        
        // when the end node reaches the end, our middle node will be in the middle aka 'right'                 place
        return middle; 
    }
}