import __HELPER_CLASSES__.ListNode;


public class RemoveDuplicateSortedList_83 {
    public static ListNode removeDuplicates(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode res_ptr = res;
        int i = Integer.MIN_VALUE;

        while(head != null) {
            if (head.val != i) {
                i = head.val;
                res_ptr.next = new ListNode(head.val);
                res_ptr = res_ptr.next;
            }
            head = head.next;
        }

        return res.next;
    }

    public static ListNode removeDuplicates1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head, next = head.next;
        while(next != null) {
            if (prev.val == next.val) {
                next = next.next;
                prev.next = next;
                continue;
            }
            prev = prev.next;
            next = next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(ListNode.build(args[0])));
        System.out.println(removeDuplicates1(ListNode.build(args[0])));
    }
}
