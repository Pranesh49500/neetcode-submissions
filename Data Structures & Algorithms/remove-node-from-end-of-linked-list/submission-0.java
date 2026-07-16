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
        ListNode curr=head;
        int cnt=1;
        while(curr.next!=null){
            curr=curr.next;
            cnt++;
        }

        if(cnt==n)
            return head.next;

        int nn=cnt-n;
        ListNode curr1=head;
        for(int i=0;i<nn-1;i++){
            curr1=curr1.next;
        }
        curr1.next=curr1.next.next;

        System.out.println(curr1.val);


        return head;
    }
}
