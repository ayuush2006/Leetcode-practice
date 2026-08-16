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
    public ListNode deleteMiddle(ListNode head) {
     ListNode slow = head;
     ListNode fast = head;
     if(head.next == null) return null;
     while(fast.next.next!= null && fast.next.next.next!= null){
        slow = slow.next;
        fast = fast.next.next;
     }
     slow.next = slow.next.next;
     return head;
    }
}





























// class Solution {
//     public ListNode deleteMiddle(ListNode head) {
//         if (head == null || head.next == null) {
//             return null;
//         }
//         int size = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             size++;
//             temp = temp.next;
//         }
//         int mid = size / 2;
//         temp = head;
//         for (int i = 1; i < mid; i++) {
//             temp = temp.next;
//         }
//         temp.next = temp.next.next;
//         return head;
//     }
// }