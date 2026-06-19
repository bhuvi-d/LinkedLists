class Solution {
    public ListNode oddEvenList(ListNode head) {
       if (head == null || head.next == null) {
            return head;
        }

        ListNode even = head;
        ListNode odd = head.next;
        ListNode pop = odd;

        while (odd != null && odd.next != null) {

            even.next = even.next.next;
            even = even.next;

            odd.next = even.next;
            odd = odd.next;
        }

        even.next = pop;

        return head;
    }
}
