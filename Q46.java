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

        ListNode rose = head;
        ListNode lilly = head;

        int length = 0;

        while(head != null){
            length++;
            head = head.next;
        }

        if(length == n){
            return lilly.next;
        }

        for(int i = 0; i < length - n - 1; i++){
            rose = rose.next;
        }

        rose.next = rose.next.next;

        return lilly;
    }
}
