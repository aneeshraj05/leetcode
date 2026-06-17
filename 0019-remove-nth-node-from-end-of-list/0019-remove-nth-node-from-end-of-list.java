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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode runner=head;
        ListNode walker=head;
        for(int i=0;i<n;i++){
            runner =runner.next;
        }
if(runner==null){
    return head=head.next;
}
        while( runner.next!=null){
           runner =runner.next;

           walker =walker.next;        }

           walker.next=walker.next.next;


    return head;

        
    }
}