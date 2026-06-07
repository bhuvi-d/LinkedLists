class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(head.val);
        ListNode tail = dummy;

        head = head.next;

        while (head != null) {

            if (head.val != tail.val) {

                tail.next = new ListNode(head.val);
                tail = tail.next;
            }

            head = head.next;
        }

        return dummy;
    }
}
