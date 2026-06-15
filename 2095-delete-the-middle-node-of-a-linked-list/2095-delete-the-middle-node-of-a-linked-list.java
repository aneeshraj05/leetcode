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
        ListNode walker=head;
        ListNode runner=head;
          if (head == null || head.next == null) {
            return null;
        }

        runner=head.next.next;
        while(runner!=null && runner.next!=null){
            walker=walker.next;
            runner=runner.next.next;
        }
        walker.next=walker.next.next;
        return head;


        
    }
}