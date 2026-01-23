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
        ListNode dummy=new ListNode(0,head);
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;

        }


        slow.next=slow.next.next;
        return dummy.next;
        // int count =0;
        // ListNode temp=head;
        // while(temp!=null){
        //     count++;
        //     temp=temp.next;

        // }
        // if(count==n){
        //     return head.next;
        // }
        // ListNode delnode =head;
        // int res=count-n;
        // for(int i=1;i<res;i++){
        //     delnode=delnode.next;

        // }
        // delnode.next=delnode.next.next;

        // return head;
        
    }
}