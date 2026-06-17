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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head=dummy;
        int carry = 0;
        while (l1!=null && l2!=null){
            int sum = l1.val + l2.val;
            if (carry>0){
                sum+=carry;
                carry=0;
            }
            if (sum>=10){
                int place = sum%10;
                carry = sum/10;
                head.next = new ListNode(place);
            }
            else{
            head.next=new ListNode(sum);
            }
            head=head.next;
            l1=l1.next;
            l2=l2.next;
        }

        int pos;
        int place;
        while (l1!=null){

            if (carry>0){
                pos = carry + l1.val;
                place = pos%10;
                carry = pos/10;
                head.next = new ListNode(place);

            }
            else{
                pos= l1.val;
                head.next = new ListNode(pos);
            }
            l1=l1.next;
            head=head.next;
        }
         while (l2!=null){

            if (carry>0){
                pos = carry + l2.val;
                place = pos%10;
                carry = pos/10;
                head.next = new ListNode(place);

            }
            else{
                pos= l2.val;
                head.next = new ListNode(pos);
            }
            l2=l2.next;
            head=head.next;
        }
        if (carry>0){
             head.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
