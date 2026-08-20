// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
    public ListNode reverse (ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode Next = null;
        while (current != null){
            Next = current.next;
            current.next = previous;
            previous = current ;
            current = Next;
        }
        return previous;
    }
    public int pairSum(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        int maxSum = 0 ;
        ListNode head1 = head;
        ListNode head2 = slow.next;
        while (head2 != null){
            int sum = head1.val + head2.val;
            if (maxSum < sum)
            maxSum = sum;
            head1 = head1.next;
            head2 = head2.next;
        }
        return maxSum;
    }
}