class Solution {
    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> up = new ArrayList<>();

        while (head != null) {
            up.add(head.val);
            head = head.next;
        }

        int i = 0;
        int j = up.size() - 1;

        while (i < j) {

            if (!up.get(i).equals(up.get(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
