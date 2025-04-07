package LinkedL;

public class RemoveNodeFromEndOfLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        int temp = 0;
        while (temp < n) {
            fast = fast.next;
            ++temp;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = fast;

        return head;
    }
}
