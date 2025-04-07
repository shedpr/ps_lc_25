public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(-1);
        ListNode ret = res;
        /**
         * 1 -> 2 -> 3
         * 1 -> 2 -> 3 -> 6
         */
        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                ret.next = list1;
                list1 = list1.next;
            } else {
                ret.next = list2;
                list2 = list2.next;
            }

            ret = ret.next;
        }

        if(list1 == null) {
            ret.next = list2;
        } else {
            ret.next = list1;
        }

        return res.next;
    }
}
