public class ReorderList {

    public ListNode reorderList(ListNode head) {
        /**
         * 1. find midpoint
         * 2. reverse second part of the linked list
         * 3. intertwine first and second part of the list
         */
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;

        ListNode prev = null;
        ListNode itr = mid;
        while (itr != null) {
            ListNode next = itr.next;
            itr.next = prev;
            prev = itr;
            itr = next;
        }

        ListNode first = head, second = prev;
        while (second.next != null) {
            ListNode tmp = first.next;
            first.next = second;
            first = tmp;

            tmp = second.next;
            second.next = first;
            second = tmp;
        }

        return head;

    }
}
