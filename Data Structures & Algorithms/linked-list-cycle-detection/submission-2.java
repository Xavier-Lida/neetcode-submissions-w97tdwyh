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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while (true) {
            if (fastPointer.next == null || fastPointer.next.next == null) return false;
            if (slowPointer == fastPointer) {
                return true;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
    }
}
